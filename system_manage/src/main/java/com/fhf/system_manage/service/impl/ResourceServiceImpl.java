package com.fhf.system_manage.service.impl;

import com.fhf.system_manage.mapper.ResourceMapper;
import com.fhf.system_manage.mapper.RoleMapper;
import com.fhf.system_manage.model.dto.*;
import com.fhf.system_manage.model.entity.Resource;
import com.fhf.system_manage.service.ResourceService;
import com.fhf.system_manage.util.BeanUtil;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/20:24
 * @Description:
 */
@Service
public class ResourceServiceImpl implements ResourceService {
    @javax.annotation.Resource
    ResourceMapper resourceMapper;
    @Override
    public void addResource(ResourceAddDto resourceAddDto) {
        Resource resource = BeanUtil.copyProperties(resourceAddDto,Resource.class);
        resourceMapper.insertSelective(resource);
    }

    @Override
    public void deleteResource(Long resourceId) {
        resourceMapper.deleteByPrimaryKey(resourceId);
    }

    @Override
    public void updateResource(ResourceUpdateDto resourceUpdateDto) {
        Resource resource = BeanUtil.copyProperties(resourceUpdateDto,Resource.class);
        resourceMapper.updateByPrimaryKeySelective(resource);
    }

    @Override
    public List<ResourceQueryResultDto> queryResource(ResourceQueryDto resourceQueryDto) {
        Example example = new Example(Resource.class);
        Example.Criteria criteria = example.createCriteria();
        if(resourceQueryDto.getName() != null){
            criteria.andLike("name","%"+resourceQueryDto.getName()+"%");
        }
        if(resourceQueryDto.getCode() != null){
            criteria.andLike("code","%"+resourceQueryDto.getCode()+"%");
        }
        if(resourceQueryDto.getResourceType() != null){
            criteria.andEqualTo("resourceType",resourceQueryDto.getResourceType());
        }
        List<Resource> resources = resourceMapper.selectByExample(example);
        List<ResourceQueryResultDto> result = new ArrayList<>();
        List<ResourceQueryResultDto> tempResult = new ArrayList<>();
        ResourceQueryResultDto temp;
        ResourceMeta resourceMeta;
        ResourceQueryResultDto aim = null;
        for(Resource resource:resources){
            temp = BeanUtil.copyProperties(resource,ResourceQueryResultDto.class);
            temp.setComponent(temp.getComponent());
            resourceMeta = new ResourceMeta();
            resourceMeta.setOpenImg(resource.getOpenImg());
            resourceMeta.setTitle(resource.getName());
            //查询对应角色要求
            resourceMeta.setRoles(resourceMapper.getAllRoles(resource.getId()));
            temp.setMeta(resourceMeta);
            if(temp.getComponent().equals("Layout")){
                temp.setChildren(new ArrayList<>());
                result.add(temp);
            }
            else{
                tempResult.add(temp);
            }
        }
        //添加孩子节点
        for(ResourceQueryResultDto resourceQueryResultDto:result){
            List<ResourceQueryResultDto> tempList = resourceQueryResultDto.getChildren();
            for(ResourceQueryResultDto resourceQueryResultDto1:tempResult){
                if(resourceQueryResultDto1.getParentId().equals(resourceQueryResultDto.getId())){
                    tempList.add(resourceQueryResultDto1);
                }
            }
        }
        return result;
    }
}

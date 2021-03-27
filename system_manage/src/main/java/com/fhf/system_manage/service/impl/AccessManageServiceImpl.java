package com.fhf.system_manage.service.impl;

import com.fhf.system_manage.mapper.ResourceMapper;
import com.fhf.system_manage.mapper.RoleResourceMapper;
import com.fhf.system_manage.mapper.UserRoleMapper;
import com.fhf.system_manage.mapper.VolunteerMapper;
import com.fhf.system_manage.model.dto.*;
import com.fhf.system_manage.model.entity.RoleResource;
import com.fhf.system_manage.model.entity.UserRole;
import com.fhf.system_manage.model.entity.Volunteer;
import com.fhf.system_manage.service.AccessManageService;
import com.fhf.system_manage.util.BeanUtil;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/27/11:18
 * @Description:
 */
@Service
public class AccessManageServiceImpl implements AccessManageService {
    @Resource
    VolunteerMapper volunteerMapper;
    @Resource
    UserRoleMapper userRoleMapper;
    @Resource
    RoleResourceMapper roleResourceMapper;

    @Override
    public VolunteerInfoDto getVolunteer(Long id) {
        Volunteer volunteer = volunteerMapper.selectByPrimaryKey(id);
        VolunteerInfoDto result = null;
        if(volunteer != null){
            result = BeanUtil.copyProperties(volunteer,VolunteerInfoDto.class);
        }
        return result;
    }

    @Override
    public void updateVolunteer(VolunteerUpdateDto volunteerUpdateDto) {
        Volunteer volunteer = BeanUtil.copyProperties(volunteerUpdateDto,Volunteer.class);
        volunteerMapper.updateByPrimaryKeySelective(volunteer);
    }

    @Override
    public void addVolunteer(VolunteerAddDto volunteerAddDto) {
        Volunteer volunteer = BeanUtil.copyProperties(volunteerAddDto,Volunteer.class);
        volunteerMapper.insertSelective(volunteer);
    }

    @Override
    public void assignRole(RoleAssignDto roleAssignDto) {
        Example example = new Example(UserRole.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id",roleAssignDto.getId());
        userRoleMapper.deleteByExample(example);
        if(roleAssignDto.getRid() != null){
            UserRole userRole = BeanUtil.copyProperties(roleAssignDto,UserRole.class);
            userRoleMapper.insert(userRole);
        }
    }

    @Override
    public void allocateResource(List<AllocateResourceDto> allocateResourceDto) {
        if(allocateResourceDto.size() == 0)
                return;
        Example example = new Example(RoleResource.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("roleId",allocateResourceDto.get(0).getRoleId());
        roleResourceMapper.deleteByExample(example);
        //添加新的角色分配关系
        for(AllocateResourceDto element:allocateResourceDto){
            roleResourceMapper.insert(BeanUtil.copyProperties(element,RoleResource.class));
        }
    }
}

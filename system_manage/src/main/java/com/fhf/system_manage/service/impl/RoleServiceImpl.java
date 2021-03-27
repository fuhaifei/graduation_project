package com.fhf.system_manage.service.impl;

import com.fhf.system_manage.mapper.RoleMapper;
import com.fhf.system_manage.model.dto.RoleAddDto;
import com.fhf.system_manage.model.dto.RoleQueryDto;
import com.fhf.system_manage.model.dto.RoleQueryResultDto;
import com.fhf.system_manage.model.dto.RoleUpdateDto;
import com.fhf.system_manage.model.entity.Role;
import com.fhf.system_manage.service.RoleService;
import com.fhf.system_manage.util.BeanUtil;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/27/9:02
 * @Description:
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    RoleMapper roleMapper;
    @Override
    public void addRole(RoleAddDto roleAddDto) {
        Role role = BeanUtil.copyProperties(roleAddDto,Role.class);
        roleMapper.insertSelective(role);
    }

    @Override
    public void deleteRole(Long roleId) {
        roleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public void updateRole(RoleUpdateDto roleUpdateDto) {
        Role role = BeanUtil.copyProperties(roleUpdateDto,Role.class);
        roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public List<RoleQueryResultDto> queryRole(RoleQueryDto roleQueryDto) {
        Example example = new Example(Role.class);
        Example.Criteria criteria = example.createCriteria();
        if(roleQueryDto.getName() != null){
            criteria.andLike("name","%"+roleQueryDto.getName()+"%");
        }
        if(roleQueryDto.getCode() != null){
            criteria.andLike("code","%"+roleQueryDto.getCode()+"%");
        }
        List<Role> roles = roleMapper.selectByExample(example);
        List<RoleQueryResultDto> result = new ArrayList<>();
        for(Role role:roles){
            result.add(BeanUtil.copyProperties(role,RoleQueryResultDto.class));
        }
        return result;
    }
}

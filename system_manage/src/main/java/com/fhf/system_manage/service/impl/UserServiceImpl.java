package com.fhf.system_manage.service.impl;

import com.fhf.system_manage.mapper.UserMapper;
import com.fhf.system_manage.mapper.VolunteerMapper;
import com.fhf.system_manage.model.dto.UserAddDto;
import com.fhf.system_manage.model.dto.UserQueryDto;
import com.fhf.system_manage.model.dto.UserQueryResultDto;
import com.fhf.system_manage.model.dto.UserUpdateDto;
import com.fhf.system_manage.model.entity.User;
import com.fhf.system_manage.service.UserService;
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
 * @Date: 2021/03/27/9:18
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Resource
    VolunteerMapper volunteerMapper;
    @Override
    public void addUser(UserAddDto userAddDto) {
        User user = BeanUtil.copyProperties(userAddDto, User.class);
        userMapper.insertSelective(user);
    }

    @Override
    public void deleteUser(Long userId) {
        //首先删除对应志愿者信息
        volunteerMapper.deleteByPrimaryKey(userId);
        userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public void updateUser(UserUpdateDto userUpdateDto) {
        User user = BeanUtil.copyProperties(userUpdateDto,User.class);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<UserQueryResultDto> queryUser(UserQueryDto userQueryDto) {
        return userMapper.getAllUser(userQueryDto);
    }
}

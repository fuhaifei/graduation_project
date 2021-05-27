package com.fhf.login_service.service.impl;
import com.fhf.login_service.mapper.UserMapper;
import com.fhf.login_service.mapper.UserRoleMapper;
import com.fhf.login_service.model.dto.LoginDto;
import com.fhf.login_service.model.dto.UserInfoDto;
import com.fhf.login_service.model.entity.User;
import com.fhf.login_service.model.entity.UserRole;
import com.fhf.login_service.service.LoginService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/28/11:02
 * @Description:
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    UserMapper userMapper;
    @Resource
    UserRoleMapper userRoleMapper;
    @Override
    public Long login(LoginDto loginDto) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name",loginDto.getUsername());
        List<User> users = userMapper.selectByExample(example);
        if(users.isEmpty() || !users.get(0).getPassword().equals(loginDto.getPassword())){
            return -1L;
        }
        return users.get(0).getId();
    }

    @Override
    public UserInfoDto getUserInfo(Long userId) {
        UserInfoDto userInfoDto = new UserInfoDto();
        System.out.println(userMapper.selectByPrimaryKey(userId));
        userInfoDto.setUser(userMapper.selectByPrimaryKey(userId));
        //查询用户的角色信息
        Example example = new Example(UserRole.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id",userId);
        List<UserRole> userRoles = userRoleMapper.selectByExample(example);
        userInfoDto.setRoles(new HashSet<>());
        for(UserRole userRole:userRoles){
            userInfoDto.getRoles().add(userRole.getRId());
        }
        //查询用户权限信息
        userInfoDto.setPermissions(new HashSet<>(userMapper.getAllPermission(userId)));
        return userInfoDto;
    }
}

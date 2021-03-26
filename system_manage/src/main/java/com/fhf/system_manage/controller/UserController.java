package com.fhf.system_manage.controller;

import com.fhf.system_manage.model.dto.UserAddDto;
import com.fhf.system_manage.model.dto.UserQueryDto;
import com.fhf.system_manage.model.dto.UserQueryResultDto;
import com.fhf.system_manage.model.dto.UserUpdateDto;
import com.fhf.system_manage.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:12
 * @Description:
 */
public class UserController {
    @Resource
    com.fhf.system_manage.service.UserService UserService;
    @PostMapping("/publish_user")
    public void addUser(@RequestBody UserAddDto UserAddDto){
        UserService.addUser(UserAddDto);
    }

    @PostMapping("/delete_user")
    public void deleteUser(@RequestBody Long UserId){
        UserService.deleteUser(UserId);
    }

    @PostMapping("/update_user")
    public void updateUser(@RequestBody UserUpdateDto UserUpdateDto){
        UserService.updateUser(UserUpdateDto);
    }

    @PostMapping("/query_user")
    public List<UserQueryResultDto> queryUser(@RequestBody UserQueryDto UserQueryDto){
        return UserService.queryUser(UserQueryDto);
    }
}

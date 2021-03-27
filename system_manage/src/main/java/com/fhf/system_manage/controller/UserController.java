package com.fhf.system_manage.controller;

import com.fhf.system_manage.model.dto.UserAddDto;
import com.fhf.system_manage.model.dto.UserQueryDto;
import com.fhf.system_manage.model.dto.UserQueryResultDto;
import com.fhf.system_manage.model.dto.UserUpdateDto;
import com.fhf.system_manage.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/system_manage")
public class UserController {
    @Resource
    UserService UserService;
    @PostMapping("/publish_user")
    public void addUser(@RequestBody UserAddDto userAddDto){
        UserService.addUser(userAddDto);
    }

    @PostMapping("/delete_user")
    public void deleteUser(@RequestBody Long userId){
        UserService.deleteUser(userId);
    }

    @PostMapping("/update_user")
    public void updateUser(@RequestBody UserUpdateDto userUpdateDto){
        UserService.updateUser(userUpdateDto);
    }

    @PostMapping("/query_user")
    public List<UserQueryResultDto> queryUser(@RequestBody UserQueryDto userQueryDto){
        return UserService.queryUser(userQueryDto);
    }
}

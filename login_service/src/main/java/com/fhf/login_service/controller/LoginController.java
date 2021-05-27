package com.fhf.login_service.controller;

import com.fhf.login_service.model.dto.LoginDto;
import com.fhf.login_service.model.dto.UserInfoDto;
import com.fhf.login_service.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/28/10:50
 * @Description:
 */
@RestController()
@RequestMapping("/login_service")
public class LoginController {
    @Resource
    LoginService loginService;

    @PostMapping("/login")
    public Long login(@RequestBody LoginDto loginDto){
        return loginService.login(loginDto);
    }

    @PostMapping("/getUserInfo")
    public UserInfoDto getUserInfo(@RequestBody Long userid){
        return loginService.getUserInfo(userid);
    }
}

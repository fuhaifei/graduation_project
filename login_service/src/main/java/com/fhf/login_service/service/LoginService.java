package com.fhf.login_service.service;

import com.fhf.login_service.model.dto.LoginDto;
import com.fhf.login_service.model.dto.UserInfoDto;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/28/11:02
 * @Description:
 */
public interface LoginService {
    /**
     * 登录系统
     * @param loginDto 登录信息DTO
     * */
    public Long login(LoginDto loginDto);

    /**
     * 查询用户详细信息
     * @param userId
     * */
    public UserInfoDto getUserInfo(Long userId);
}

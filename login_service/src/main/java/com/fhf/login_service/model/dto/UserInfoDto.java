package com.fhf.login_service.model.dto;

import com.fhf.login_service.model.entity.User;
import lombok.Data;
import java.util.Set;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/28/16:32
 * @Description:
 */
@Data
public class UserInfoDto {
    /**
     * 系统用户信息
     * */
    private User user;
    /**
     * 用户角色信息
     * */
    private Set<Long> roles;
    /**
     * 用户所拥有权限
     */
    private Set<String> permissions;

}

package com.fhf.system_manage.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/20:28
 * @Description:
 */
@Data
public class UserAddDto {
    /**
     * 密码
     */
    private String password;

    /**
     * 名字
     */
    private String name;

    /**
     * 头像
     */
    private String profilePicture;

    /**
     * 性别
     */
    private Byte sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 其他联系
     */
    private String other;

    /**
     * 备注
     */
    private String remark;
}

package com.fhf.system_manage.model.entity;

import lombok.Data;

import javax.persistence.Column;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:10
 * @Description: 
 */

/**
 * 用户和角色的中间表
 */
@Data
public class UserRole {
    /**
     * 用户id
     */
    private Long id;

    /**
     * 角色id
     */
    @Column(name = "r_id")
    private Long rid;
}
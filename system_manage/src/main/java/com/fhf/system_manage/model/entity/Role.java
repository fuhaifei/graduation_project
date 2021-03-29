package com.fhf.system_manage.model.entity;

import lombok.Data;

import javax.persistence.Id;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/28/10:55
 * @Description: 
 */

/**
 * 角色
 */
@Data
public class Role {
    @Id
    private Long id;

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色代码
     */
    private String code;

    /**
     * 备注
     */
    private String remark;
}
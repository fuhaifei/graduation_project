package com.fhf.system_manage.model.entity;

import lombok.Data;

import javax.persistence.Id;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/27/9:28
 * @Description: 
 */
/**
    * 志愿者表
    */
@Data
public class Volunteer {
    /**
    * 用户id
    */
    @Id
    private Long userId;

    /**
    * 学号
    */
    private Long studentId;

    /**
    * 身份证号
    */
    private String idCard;

    /**
    * 学院
    */
    private String college;

    /**
    * 专业
    */
    private String major;

    /**
    * 爱好
    */
    private String habit;

    /**
    * 备注
    */
    private String remark;
}
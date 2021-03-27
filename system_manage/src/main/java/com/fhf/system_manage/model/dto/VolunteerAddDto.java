package com.fhf.system_manage.model.dto;

import lombok.Data;

import javax.persistence.Id;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/27/14:47
 * @Description:
 */
@Data
public class VolunteerAddDto {
    /**
     * 用户id
     */
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

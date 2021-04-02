package com.fhf.activity_manage.model.DTO;

import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/04/01/19:20
 * @Description:
 */
@Data
public class VolunteerDetailDto {

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

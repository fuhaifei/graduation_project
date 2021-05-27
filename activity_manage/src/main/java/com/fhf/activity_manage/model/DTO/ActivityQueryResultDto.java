package com.fhf.activity_manage.model.DTO;


import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/24/14:58
 * @Description:
 */
@Data
public class ActivityQueryResultDto {
    /**
     * 活动id
     */
    private Long activityId;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动类型
     */
    private String category;

    /**
     * 活动地点
     */
    private String site;

    /**
     * 活动描述
     */
    private String description;

    /**
     * 志愿时长
     */
    private Double duration;

    /**
     * 参与要求
     */
    private String require;

    /**
     * 计划招收人数
     */
    private Integer planNumber;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建人
     */
    private Long createBy;

}

package com.fhf.activity_manage.model.entity.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/9:20
 * @Description:
 */
public class PublishActivityQueryResult {
    /**
     * 发布信息ID
     * */
    private Long publishId;

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
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime endtime;

    /**
     * 报名截止时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime applyEndTime;

    /**
     * 报名人数
     */
    private Integer signupNumber;

    /**
     * 计划人数
     */
    private Integer planNumber;

    /**
     * 志愿者群
     */
    private String qqGroup;

    /**
     * 备注
     */
    private String note;
}

package com.fhf.activity_manage.model.entity.DTO;

import lombok.Data;

import javax.persistence.Id;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/17:06
 * @Description:
 */
@Data
public class ActivityRecordQueryResult {


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
    private Double time;

    /**
     * 评价
     */
    private String evaluation;

    /**
     * 评分
     */
    private Integer score;

    /**
     * 评定人
     */
    private String appraiser;

    /**
     * 备注
     */
    private String note;

    /**
     * 状态
     * 0 未结束
     * 1 已评价
     * 2 未参与
     */
    private Integer status;
}

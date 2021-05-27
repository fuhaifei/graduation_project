package com.fhf.activity_manage.model.DTO;

import lombok.Data;

import javax.persistence.Column;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/04/02/14:52
 * @Description: 查询未评价记录进行评价
 */
@Data
public class RecordToEvaluation {
    private  Long recordId;
    private String userName;
    /**
     * 活动名称
     */
    @Column(name = "`name`")
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
}

package com.fhf.activity_manage.model.entity.DTO;

import lombok.Data;

import javax.persistence.Id;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/16:17
 * @Description:
 */
@Data
public class ParticipationExamineDto {
    /**
     * 记录Id
     */
    private Long recordId;

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
    private Long appraiser;

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

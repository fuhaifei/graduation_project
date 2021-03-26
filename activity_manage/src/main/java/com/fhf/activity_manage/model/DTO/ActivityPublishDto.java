package com.fhf.activity_manage.model.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/8:38
 * @Description: 发布志愿活动类
 */
@Data
public class ActivityPublishDto {
    private Long belongTo;
    /**
     * 发布者
     */
    private Long publisher;

    /**
     * 负责人
     */
    private Long chargeBy;

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

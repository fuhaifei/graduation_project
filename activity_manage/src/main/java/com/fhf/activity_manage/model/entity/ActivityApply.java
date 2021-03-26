package com.fhf.activity_manage.model.entity;

import lombok.Data;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/24/16:11
 * @Description: 
 */

/**
 * 志愿活动申请
 */
@Data
public class ActivityApply {
    /**
     * 申请Id
     */
    @Id
    private Long applyId;

    /**
     * 申请时间
     */
    private LocalDateTime applyTime;

    /**
     * 申请活动ID
     */
    private Long applyFor;

    /**
     * 申请人
     */
    private Long applyBy;

    /**
     * 批准人
     */
    private Long approveBy;

    /**
     * 状态(是否已通过)
     * 0 等待审核
     * 1 通过
     * 2 未通过
     */
    private Integer status;

    /**
     * 备注信息
     */
    private String note;
}
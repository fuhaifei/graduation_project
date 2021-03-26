package com.fhf.activity_manage.model.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/10:50
 * @Description: 申请志愿活动
 */
@Data
public class ApplyForActivityDto {

    /**
     * 申请Id
     */
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
     */
    private Integer status;

    /**
     * 备注信息
     */
    private String note;

}

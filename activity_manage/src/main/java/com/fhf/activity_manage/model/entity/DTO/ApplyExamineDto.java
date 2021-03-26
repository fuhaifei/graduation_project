package com.fhf.activity_manage.model.entity.DTO;

import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/14:57
 * @Description:
 */
@Data
public class ApplyExamineDto {
    /**
     * 申请Id
     */
    private Long applyId;

    /**
     * 申请人
     */
    private Long applyBy;

    /**
     * 申请活动ID
     */
    private Long applyFor;

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

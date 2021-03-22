package com.fhf.acticity_manage.model.entity;

import java.util.Date;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:07
 * @Description: 
 */
/**
    * 志愿活动申请
    */
public class ActivityApply {
    /**
    * 申请Id
    */
    private Long applyId;

    /**
    * 申请时间
    */
    private Date applyTime;

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

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Long getApplyFor() {
        return applyFor;
    }

    public void setApplyFor(Long applyFor) {
        this.applyFor = applyFor;
    }

    public Long getApplyBy() {
        return applyBy;
    }

    public void setApplyBy(Long applyBy) {
        this.applyBy = applyBy;
    }

    public Long getApproveBy() {
        return approveBy;
    }

    public void setApproveBy(Long approveBy) {
        this.approveBy = approveBy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
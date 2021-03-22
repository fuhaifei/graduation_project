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
    * 发布活动表
    */
public class PublishedActivity {
    private Long publishId;

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
    private Date startTime;

    /**
    * 结束时间
    */
    private Date endtime;

    /**
    * 报名截止时间
    */
    private Date applyEndTime;

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

    public Long getPublishId() {
        return publishId;
    }

    public void setPublishId(Long publishId) {
        this.publishId = publishId;
    }

    public Long getPublisher() {
        return publisher;
    }

    public void setPublisher(Long publisher) {
        this.publisher = publisher;
    }

    public Long getChargeBy() {
        return chargeBy;
    }

    public void setChargeBy(Long chargeBy) {
        this.chargeBy = chargeBy;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getApplyEndTime() {
        return applyEndTime;
    }

    public void setApplyEndTime(Date applyEndTime) {
        this.applyEndTime = applyEndTime;
    }

    public Integer getSignupNumber() {
        return signupNumber;
    }

    public void setSignupNumber(Integer signupNumber) {
        this.signupNumber = signupNumber;
    }

    public Integer getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(Integer planNumber) {
        this.planNumber = planNumber;
    }

    public String getQqGroup() {
        return qqGroup;
    }

    public void setQqGroup(String qqGroup) {
        this.qqGroup = qqGroup;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
package com.fhf.activity_manage.model.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/26/8:35
 * @Description: 
 */
/**
    * 发布活动表
    */
@Data
public class PublishedActivity {
    private Long publishId;

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
    private LocalDateTime startTime;

    /**
    * 结束时间
    */
    private LocalDateTime endtime;

    /**
    * 报名截止时间
    */
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

    /**
     * 状态
     * */
    private Integer status;

    public Long getPublishId() {
        return publishId;
    }

    public void setPublishId(Long publishId) {
        this.publishId = publishId;
    }

    public Long getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(Long belongTo) {
        this.belongTo = belongTo;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", publishId=").append(publishId);
        sb.append(", belongTo=").append(belongTo);
        sb.append(", publisher=").append(publisher);
        sb.append(", chargeBy=").append(chargeBy);
        sb.append(", startTime=").append(startTime);
        sb.append(", endtime=").append(endtime);
        sb.append(", applyEndTime=").append(applyEndTime);
        sb.append(", signupNumber=").append(signupNumber);
        sb.append(", planNumber=").append(planNumber);
        sb.append(", qqGroup=").append(qqGroup);
        sb.append(", note=").append(note);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PublishedActivity other = (PublishedActivity) that;
        return (this.getPublishId() == null ? other.getPublishId() == null : this.getPublishId().equals(other.getPublishId()))
            && (this.getBelongTo() == null ? other.getBelongTo() == null : this.getBelongTo().equals(other.getBelongTo()))
            && (this.getPublisher() == null ? other.getPublisher() == null : this.getPublisher().equals(other.getPublisher()))
            && (this.getChargeBy() == null ? other.getChargeBy() == null : this.getChargeBy().equals(other.getChargeBy()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getApplyEndTime() == null ? other.getApplyEndTime() == null : this.getApplyEndTime().equals(other.getApplyEndTime()))
            && (this.getSignupNumber() == null ? other.getSignupNumber() == null : this.getSignupNumber().equals(other.getSignupNumber()))
            && (this.getPlanNumber() == null ? other.getPlanNumber() == null : this.getPlanNumber().equals(other.getPlanNumber()))
            && (this.getQqGroup() == null ? other.getQqGroup() == null : this.getQqGroup().equals(other.getQqGroup()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPublishId() == null) ? 0 : getPublishId().hashCode());
        result = prime * result + ((getBelongTo() == null) ? 0 : getBelongTo().hashCode());
        result = prime * result + ((getPublisher() == null) ? 0 : getPublisher().hashCode());
        result = prime * result + ((getChargeBy() == null) ? 0 : getChargeBy().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getApplyEndTime() == null) ? 0 : getApplyEndTime().hashCode());
        result = prime * result + ((getSignupNumber() == null) ? 0 : getSignupNumber().hashCode());
        result = prime * result + ((getPlanNumber() == null) ? 0 : getPlanNumber().hashCode());
        result = prime * result + ((getQqGroup() == null) ? 0 : getQqGroup().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}
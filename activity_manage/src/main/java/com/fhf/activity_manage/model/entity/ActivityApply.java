package com.fhf.activity_manage.model.entity;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyId=").append(applyId);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applyFor=").append(applyFor);
        sb.append(", applyBy=").append(applyBy);
        sb.append(", approveBy=").append(approveBy);
        sb.append(", status=").append(status);
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
        ActivityApply other = (ActivityApply) that;
        return (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
                && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
                && (this.getApplyFor() == null ? other.getApplyFor() == null : this.getApplyFor().equals(other.getApplyFor()))
                && (this.getApplyBy() == null ? other.getApplyBy() == null : this.getApplyBy().equals(other.getApplyBy()))
                && (this.getApproveBy() == null ? other.getApproveBy() == null : this.getApproveBy().equals(other.getApproveBy()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getApplyFor() == null) ? 0 : getApplyFor().hashCode());
        result = prime * result + ((getApplyBy() == null) ? 0 : getApplyBy().hashCode());
        result = prime * result + ((getApproveBy() == null) ? 0 : getApproveBy().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}
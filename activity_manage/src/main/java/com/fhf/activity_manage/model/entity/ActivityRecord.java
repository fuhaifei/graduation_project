package com.fhf.activity_manage.model.entity;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/24/16:10
 * @Description: 
 */

/**
 * 参与志愿活动记录
 */
public class ActivityRecord {
    /**
     * 记录Id
     */
    private Long recordId;

    /**
     * 参与人
     */
    private Long participant;

    /**
     * 所属活动
     */
    private Long belongActivity;

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
     */
    private Integer status;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getParticipant() {
        return participant;
    }

    public void setParticipant(Long participant) {
        this.participant = participant;
    }

    public Long getBelongActivity() {
        return belongActivity;
    }

    public void setBelongActivity(Long belongActivity) {
        this.belongActivity = belongActivity;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getAppraiser() {
        return appraiser;
    }

    public void setAppraiser(Long appraiser) {
        this.appraiser = appraiser;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append(", participant=").append(participant);
        sb.append(", belongActivity=").append(belongActivity);
        sb.append(", time=").append(time);
        sb.append(", evaluation=").append(evaluation);
        sb.append(", score=").append(score);
        sb.append(", appraiser=").append(appraiser);
        sb.append(", note=").append(note);
        sb.append(", status=").append(status);
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
        ActivityRecord other = (ActivityRecord) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
                && (this.getParticipant() == null ? other.getParticipant() == null : this.getParticipant().equals(other.getParticipant()))
                && (this.getBelongActivity() == null ? other.getBelongActivity() == null : this.getBelongActivity().equals(other.getBelongActivity()))
                && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
                && (this.getEvaluation() == null ? other.getEvaluation() == null : this.getEvaluation().equals(other.getEvaluation()))
                && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
                && (this.getAppraiser() == null ? other.getAppraiser() == null : this.getAppraiser().equals(other.getAppraiser()))
                && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getParticipant() == null) ? 0 : getParticipant().hashCode());
        result = prime * result + ((getBelongActivity() == null) ? 0 : getBelongActivity().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getAppraiser() == null) ? 0 : getAppraiser().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}
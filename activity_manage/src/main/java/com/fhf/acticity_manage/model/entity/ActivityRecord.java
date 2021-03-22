package com.fhf.acticity_manage.model.entity;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:07
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
}
package com.fhf.acticity_manage.model.entity;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:07
 * @Description: 
 */
/**
    * 志愿活动表
    */
public class VolunteerActivity {
    /**
    * 活动id
    */
    private Long activityId;

    /**
    * 活动名称
    */
    private String name;

    /**
    * 活动类型
    */
    private String category;

    /**
    * 活动地点
    */
    private String site;

    /**
    * 活动描述
    */
    private String description;

    /**
    * 志愿时长
    */
    private Double duration;

    /**
    * 参与要求
    */
    private String require;

    /**
    * 计划招收人数
    */
    private Integer planNumber;

    /**
    * 备注
    */
    private String note;

    /**
    * 创建人
    */
    private Long createBy;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getRequire() {
        return require;
    }

    public void setRequire(String require) {
        this.require = require;
    }

    public Integer getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(Integer planNumber) {
        this.planNumber = planNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }
}
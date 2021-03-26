package com.fhf.activity_manage.model.entity;

import javax.persistence.*;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/24/16:07
 * @Description: 
 */

/**
 * 志愿活动表
 */
@Table(name = "volunteer_activity")
public class VolunteerActivity {
    /**
     * 活动id
     */
    @Id
    @Column(name = "activity_id")
    @GeneratedValue(generator = "JDBC")
    private Long activityId;

    /**
     * 活动名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 活动类型
     */
    @Column(name = "category")
    private String category;

    /**
     * 活动地点
     */
    @Column(name = "site")
    private String site;

    /**
     * 活动描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 志愿时长
     */
    @Column(name = "duration")
    private Double duration;

    /**
     * 参与要求
     */
    @Column(name = "`require`")
    private String require;

    /**
     * 计划招收人数
     */
    @Column(name = "plan_number")
    private Integer planNumber;

    /**
     * 备注
     */
    @Column(name = "note")
    private String note;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private Long createBy;

    /**
     * 获取活动id
     *
     * @return activity_id - 活动id
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 设置活动id
     *
     * @param activityId 活动id
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取活动名称
     *
     * @return name - 活动名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置活动名称
     *
     * @param name 活动名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取活动类型
     *
     * @return category - 活动类型
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置活动类型
     *
     * @param category 活动类型
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取活动地点
     *
     * @return site - 活动地点
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置活动地点
     *
     * @param site 活动地点
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 获取活动描述
     *
     * @return description - 活动描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置活动描述
     *
     * @param description 活动描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取志愿时长
     *
     * @return duration - 志愿时长
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * 设置志愿时长
     *
     * @param duration 志愿时长
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * 获取参与要求
     *
     * @return require - 参与要求
     */
    public String getRequire() {
        return require;
    }

    /**
     * 设置参与要求
     *
     * @param require 参与要求
     */
    public void setRequire(String require) {
        this.require = require;
    }

    /**
     * 获取计划招收人数
     *
     * @return plan_number - 计划招收人数
     */
    public Integer getPlanNumber() {
        return planNumber;
    }

    /**
     * 设置计划招收人数
     *
     * @param planNumber 计划招收人数
     */
    public void setPlanNumber(Integer planNumber) {
        this.planNumber = planNumber;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activityId=").append(activityId);
        sb.append(", name=").append(name);
        sb.append(", category=").append(category);
        sb.append(", site=").append(site);
        sb.append(", description=").append(description);
        sb.append(", duration=").append(duration);
        sb.append(", require=").append(require);
        sb.append(", planNumber=").append(planNumber);
        sb.append(", note=").append(note);
        sb.append(", createBy=").append(createBy);
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
        VolunteerActivity other = (VolunteerActivity) that;
        return (this.getActivityId() == null ? other.getActivityId() == null : this.getActivityId().equals(other.getActivityId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
                && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
                && (this.getRequire() == null ? other.getRequire() == null : this.getRequire().equals(other.getRequire()))
                && (this.getPlanNumber() == null ? other.getPlanNumber() == null : this.getPlanNumber().equals(other.getPlanNumber()))
                && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
                && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getRequire() == null) ? 0 : getRequire().hashCode());
        result = prime * result + ((getPlanNumber() == null) ? 0 : getPlanNumber().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        return result;
    }
}
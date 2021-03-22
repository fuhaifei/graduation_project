package com.fhf.system_manage.model.entity;

import java.util.Date;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:14
 * @Description: 
 */
/**
    * 公告管理
    */
public class Notice {
    /**
    * 公告id
    */
    private Long noticeId;

    /**
    * 公告类型
    */
    private Integer type;

    /**
    * 公告标题
    */
    private String title;

    /**
    * 公告内容
    */
    private String content;

    /**
    * 创建时间
    */
    private Date publishTime;

    /**
    * 发布人
    */
    private Long publishBy;

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Long getPublishBy() {
        return publishBy;
    }

    public void setPublishBy(Long publishBy) {
        this.publishBy = publishBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noticeId=").append(noticeId);
        sb.append(", type=").append(type);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", publishBy=").append(publishBy);
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
        Notice other = (Notice) that;
        return (this.getNoticeId() == null ? other.getNoticeId() == null : this.getNoticeId().equals(other.getNoticeId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getPublishTime() == null ? other.getPublishTime() == null : this.getPublishTime().equals(other.getPublishTime()))
            && (this.getPublishBy() == null ? other.getPublishBy() == null : this.getPublishBy().equals(other.getPublishBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoticeId() == null) ? 0 : getNoticeId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getPublishTime() == null) ? 0 : getPublishTime().hashCode());
        result = prime * result + ((getPublishBy() == null) ? 0 : getPublishBy().hashCode());
        return result;
    }
}
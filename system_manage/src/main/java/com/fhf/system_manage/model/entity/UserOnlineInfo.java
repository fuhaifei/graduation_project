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
    * 用户在线情况
    */
public class UserOnlineInfo {
    /**
    * 在线用户id
    */
    private Long id;

    /**
    * 用户id
    */
    private Long uId;

    /**
    * IP
    */
    private String ip;

    /**
    * 上线时间
    */
    private Date onlineTime;

    /**
    * 下线时间
    */
    private Date offlineTime;

    /**
    * 在线时长
    */
    private Integer stopTime;

    /**
    * 状态位
    */
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public Integer getStopTime() {
        return stopTime;
    }

    public void setStopTime(Integer stopTime) {
        this.stopTime = stopTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uId=").append(uId);
        sb.append(", ip=").append(ip);
        sb.append(", onlineTime=").append(onlineTime);
        sb.append(", offlineTime=").append(offlineTime);
        sb.append(", stopTime=").append(stopTime);
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
        UserOnlineInfo other = (UserOnlineInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getOnlineTime() == null ? other.getOnlineTime() == null : this.getOnlineTime().equals(other.getOnlineTime()))
            && (this.getOfflineTime() == null ? other.getOfflineTime() == null : this.getOfflineTime().equals(other.getOfflineTime()))
            && (this.getStopTime() == null ? other.getStopTime() == null : this.getStopTime().equals(other.getStopTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getOnlineTime() == null) ? 0 : getOnlineTime().hashCode());
        result = prime * result + ((getOfflineTime() == null) ? 0 : getOfflineTime().hashCode());
        result = prime * result + ((getStopTime() == null) ? 0 : getStopTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}
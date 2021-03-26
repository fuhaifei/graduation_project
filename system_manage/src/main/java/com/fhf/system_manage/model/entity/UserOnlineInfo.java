package com.fhf.system_manage.model.entity;

import java.util.Date;
import lombok.Data;

import javax.persistence.Id;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:10
 * @Description: 
 */

/**
 * 用户在线情况
 */
@Data
public class UserOnlineInfo {
    /**
     * 在线用户id
     */
    @Id
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
}
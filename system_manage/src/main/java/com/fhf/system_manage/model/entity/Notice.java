package com.fhf.system_manage.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

import javax.persistence.Id;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:08
 * @Description: 
 */

/**
 * 公告管理
 */
@Data
public class Notice {
    /**
     * 公告id
     */
    @Id
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

    private LocalDateTime publishTime;

    /**
     * 发布人
     */
    private Long publishBy;
}
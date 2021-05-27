package com.fhf.system_manage.model.dto;

import lombok.Data;

import javax.persistence.Id;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:40
 * @Description: 更新公告信息Dto
 */
@Data
public class NoticeUpdateDto {
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
}

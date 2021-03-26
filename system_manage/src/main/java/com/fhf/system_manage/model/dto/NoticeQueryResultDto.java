package com.fhf.system_manage.model.dto;

import lombok.Data;

import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:44
 * @Description:
 */
@Data
public class NoticeQueryResultDto {
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

    private LocalDate publishTime;

    /**
     * 发布人
     */
    private Long publishBy;
}

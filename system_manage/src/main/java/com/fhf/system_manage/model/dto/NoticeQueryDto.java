package com.fhf.system_manage.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:43
 * @Description:
 */
@Data
public class NoticeQueryDto {
    /**
     * 公告类型
     */
    private Integer type;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 发布起止时间
     * */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime fromTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime toTime;
}

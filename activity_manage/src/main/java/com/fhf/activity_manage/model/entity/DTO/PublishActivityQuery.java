package com.fhf.activity_manage.model.entity.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/9:16
 * @Description:
 */
@Data
public class PublishActivityQuery {
    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动类型
     */
    private String category;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime endTime;

    /**
     * 是否截至报名
     * */
    private  int isEnd;
}

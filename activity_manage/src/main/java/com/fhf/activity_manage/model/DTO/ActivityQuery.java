package com.fhf.activity_manage.model.DTO;

import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/24/15:01
 * @Description: 查询活动DTO
 */
@Data
public class ActivityQuery {
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
}

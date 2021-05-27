package com.fhf.activity_manage.model.DTO;

import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/04/02/14:59
 * @Description: 查询符合条件
 */
@Data
public class RecordToEvaluationQuery {

    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动类型
     */
    private String category;

    /**
     * 活动参与人
     * */
    private String username;
}

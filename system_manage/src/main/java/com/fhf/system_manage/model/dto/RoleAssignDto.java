package com.fhf.system_manage.model.dto;

import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/27/15:00
 * @Description:
 */
@Data
public class RoleAssignDto {
    /**
     * 用户id
     */
    private Long id;

    /**
     * 角色id
     */
    private Long rid;
}

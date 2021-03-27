package com.fhf.system_manage.model.dto;

import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/20:26
 * @Description:
 */
@Data
public class RoleQueryDto {
    /**
     * 角色名
     */
    private String name;

    /**
     * 角色代码
     */
    private String code;
}

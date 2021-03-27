package com.fhf.system_manage.model.dto;

import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/27/15:07
 * @Description:
 */
@Data
public class AllocateResourceDto {
    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 资源id
     */
    private Long resId;
}

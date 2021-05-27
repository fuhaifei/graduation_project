package com.fhf.system_manage.model.dto;

import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/20:20
 * @Description: 查询资源类
 */
@Data
public class ResourceQueryDto {
    /**
     * 资源名
     */
    private String name;

    /**
     * 编号
     */
    private String code;
    /**
     * 资源类型
     */
    private Byte resourceType;
}

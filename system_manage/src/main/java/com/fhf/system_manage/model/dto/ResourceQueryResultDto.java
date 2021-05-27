package com.fhf.system_manage.model.dto;

import lombok.Data;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/20:20
 * @Description:
 */
@Data
public class ResourceQueryResultDto {
    private Long id;
    private String component;
    /**
     * 资源名
     */
    private String name;

    /**
     * 父亲节点
     */
    private Long parentId;

    /**
     * 资源路径
     */
    private String url;
    /**
     * 资源路径
     * */
    private String path;
    /**
     * 叶子节点
     */
    private Byte leaf;

    /**
     * 资源信息
     * */
    private ResourceMeta meta;

    private List<ResourceQueryResultDto> children;
}

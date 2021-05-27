package com.fhf.system_manage.model.dto;

import lombok.Data;

import javax.persistence.Id;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/20:21
 * @Description: 更新资源类
 */
@Data
public class ResourceUpdateDto {
    @Id
    private Long id;

    /**
     * 资源名
     */
    private String name;

    /**
     * 编号
     */
    private String code;

    /**
     * 父亲节点
     */
    private Long parentId;

    /**
     * 资源路径
     */
    private String url;

    /**
     * 资源类型
     */
    private Byte resourceType;

    /**
     * 打开图标
     */
    private String openImg;

    /**
     * 关闭图标
     */
    private String closeImg;

    /**
     * 叶子节点
     */
    private Byte leaf;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    private Byte status;
}

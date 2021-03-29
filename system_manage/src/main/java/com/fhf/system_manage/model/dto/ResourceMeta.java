package com.fhf.system_manage.model.dto;

import lombok.Data;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/29/8:27
 * @Description:
 */
@Data
public class ResourceMeta {
    private String title;
    private String icon;
    private String openImg;
    private String closeImg;
    private List<Long> roles;
}

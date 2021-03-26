package com.fhf.system_manage.service;

import com.fhf.system_manage.model.dto.*;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:13
 * @Description:
 */
public interface ResourceService {

    /**
     * 新增资源信息
     * @param resourceAddDto 新增 资源信息
     * */
    public void addResource(ResourceAddDto resourceAddDto);

    /**
     * 删除资源信息
     * @param resourceId  资源Id
     * */
    public void deleteResource(Long resourceId);

    /**
     * 更新资源信息
     * @param  resourceUpdateDto 更新资源信息
     * */
    public void updateResource(ResourceUpdateDto resourceUpdateDto);

    /**
     * 查询资源信息
     * @param resourceQueryDto 资源查询信息
     * */
    public List<ResourceQueryResultDto> queryResource(ResourceQueryDto resourceQueryDto);
}

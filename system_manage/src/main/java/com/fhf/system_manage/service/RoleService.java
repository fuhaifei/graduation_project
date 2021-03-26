package com.fhf.system_manage.service;

import com.fhf.system_manage.model.dto.RoleAddDto;
import com.fhf.system_manage.model.dto.RoleQueryDto;
import com.fhf.system_manage.model.dto.RoleQueryResultDto;
import com.fhf.system_manage.model.dto.RoleUpdateDto;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:13
 * @Description:
 */
public interface RoleService {

    /**
     * 新增资源信息
     * @param RoleAddDto 新增 资源信息
     * */
    public void addRole(RoleAddDto RoleAddDto);

    /**
     * 删除资源信息
     * @param RoleId  资源Id
     * */
    public void deleteRole(Long RoleId);

    /**
     * 更新资源信息
     * @param  RoleUpdateDto 更新资源信息
     * */
    public void updateRole(RoleUpdateDto RoleUpdateDto);

    /**
     * 查询资源信息
     * @param RoleQueryDto 资源查询信息
     * */
    public List<RoleQueryResultDto> queryRole(RoleQueryDto RoleQueryDto);
}

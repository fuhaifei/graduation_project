package com.fhf.system_manage.service;

import com.fhf.system_manage.model.dto.*;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/27/11:15
 * @Description:
 */
public interface AccessManageService {

    /**
     * 查找志愿者详细信息
     * @param id 志愿者Id信息
     * */
    public VolunteerInfoDto getVolunteer(Long id);

    /**
     * 修改志愿者信息
     * @param volunteerUpdateDto 修改志愿者信息类
     * */
    public void updateVolunteer(VolunteerUpdateDto volunteerUpdateDto);

    /**
     * 新增志愿者信息
     * @param volunteerAddDto 新增志愿者
     * */
    public void addVolunteer(VolunteerAddDto volunteerAddDto);

    /**
     * 分配或修改角色
     * @param roleAssignDto 分配角色
     * */
    public void assignRole(RoleAssignDto roleAssignDto);

    /**
     * 分配或修改角色资源
     * @param  allocateResourceDto 分配角色资源Dto
     * */
    public void allocateResource(List<AllocateResourceDto> allocateResourceDto);
}

package com.fhf.system_manage.controller;
import com.fhf.system_manage.model.dto.*;
import com.fhf.system_manage.service.AccessManageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/27/11:13
 * @Description: 角色 用户 权限分配管理控制
 */
@RestController
@RequestMapping("/system_manage")
public class AccessManageController {

    @Resource
    AccessManageService accessManageService;

    /**
     * 查询志愿者信息
     * */
    @PostMapping("/get_volunteer")
    public VolunteerInfoDto getVolunteer(@RequestBody Long id){
        return accessManageService.getVolunteer(id);
    }

    /**
     * 修改志愿者信息
     * */
    @PostMapping("/update_volunteer")
    public void updateVolunteer(@RequestBody VolunteerUpdateDto volunteerUpdateDto){
        accessManageService.updateVolunteer(volunteerUpdateDto);
    }

    /**
     * 增加志愿者信息
     * */
    @PostMapping("/add_volunteer")
    public void addUser(@RequestBody VolunteerAddDto volunteerAddDto){
        accessManageService.addVolunteer(volunteerAddDto);
    }

    /**
     * 修改、添加用户角色
     * */
    @PostMapping("/assign_role")
    public void assignRoleToUser(@RequestBody RoleAssignDto roleAssignDto){
        accessManageService.assignRole(roleAssignDto);
    }

    /**
     * 修改角色所具有的资源
     * */
    @PostMapping("/assign_resource")
    public void allocateResource(@RequestBody List<AllocateResourceDto> allocateResourceDto){
        accessManageService.allocateResource(allocateResourceDto);
    }
}

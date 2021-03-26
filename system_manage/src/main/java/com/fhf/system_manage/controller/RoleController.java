package com.fhf.system_manage.controller;

import com.fhf.system_manage.model.dto.RoleAddDto;
import com.fhf.system_manage.model.dto.RoleQueryDto;
import com.fhf.system_manage.model.dto.RoleQueryResultDto;
import com.fhf.system_manage.model.dto.RoleUpdateDto;
import com.fhf.system_manage.service.RoleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:12
 * @Description:
 */
public class RoleController {

    @Resource
    RoleService RoleService;
    @PostMapping("/publish_role")
    public void addRole(@RequestBody RoleAddDto RoleAddDto){
        RoleService.addRole(RoleAddDto);
    }

    @PostMapping("/delete_role")
    public void deleteRole(@RequestBody Long RoleId){
        RoleService.deleteRole(RoleId);
    }

    @PostMapping("/update_role")
    public void updateRole(@RequestBody RoleUpdateDto RoleUpdateDto){
        RoleService.updateRole(RoleUpdateDto);
    }

    @PostMapping("/query_role")
    public List<RoleQueryResultDto> queryRole(@RequestBody RoleQueryDto RoleQueryDto){
        return RoleService.queryRole(RoleQueryDto);
    }
}

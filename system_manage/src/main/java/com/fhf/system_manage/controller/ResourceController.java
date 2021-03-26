package com.fhf.system_manage.controller;

import com.fhf.system_manage.model.dto.*;
import com.fhf.system_manage.service.NoticeService;
import com.fhf.system_manage.service.ResourceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/system_manage")
public class ResourceController {
    @Resource
    ResourceService resourceService;
    @PostMapping("/publish_resource")
    public void addResource(@RequestBody ResourceAddDto resourceAddDto){
        resourceService.addResource(resourceAddDto);
    }

    @PostMapping("/delete_resource")
    public void deleteResource(@RequestBody Long resourceId){
        resourceService.deleteResource(resourceId);
    }

    @PostMapping("/update_resource")
    public void updateResource(@RequestBody ResourceUpdateDto resourceUpdateDto){
        resourceService.updateResource(resourceUpdateDto);
    }

    @PostMapping("/query_resource")
    public List<ResourceQueryResultDto> queryResource(@RequestBody ResourceQueryDto resourceQueryDto){
        return resourceService.queryResource(resourceQueryDto);
    }
}

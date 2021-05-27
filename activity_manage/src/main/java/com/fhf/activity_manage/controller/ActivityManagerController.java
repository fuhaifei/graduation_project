package com.fhf.activity_manage.controller;

import com.fhf.activity_manage.mapper.ActivityRecordMapper;
import com.fhf.activity_manage.model.DTO.*;
import com.fhf.activity_manage.service.ActivityManageService;
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
 * @Date: 2021/03/24/15:23
 * @Description: 志愿活动负责人控制类
 */
@RestController
@RequestMapping("/activity_manage")
public class ActivityManagerController {
    @Resource
    public ActivityManageService activityManageService;

    @PostMapping("/query_activity")
    public List<ActivityQueryResultDto> queryActivity(@RequestBody ActivityQuery activityQuery){
        return activityManageService.getActivity(activityQuery);
    }

    @PostMapping("/add_activity")
    public void addActivity(@RequestBody ActivityAddDto activityAddDto){
        activityManageService.addActivity(activityAddDto);
    }

    @PostMapping("/delete_activity")
    public String deleteActivity(@RequestBody Long id){
        return activityManageService.deleteActivity(id);
    }

    @PostMapping("/update_activity")
    public void updateActivity(@RequestBody ActivityUpdateDto activityUpdateDto){
        activityManageService.updateActivity(activityUpdateDto);
    }
    /**
     * 发布志愿活动
     * */
    @PostMapping("/publish_activity")
    public void publishActivity(@RequestBody ActivityPublishDto activityPublishDto){
        activityManageService.publishActivity(activityPublishDto);
    }

    /**
     * 结束志愿活动
     * */
    @PostMapping("/finish_activity")
    public String finishActivity(@RequestBody Long publishActivityId){
        return activityManageService.finishActivity(publishActivityId);
    }

    /**
     * 查询所有申请信息
     * */
    @PostMapping("/getAllApply")
    public List<AllActivityApplyDto> getAllActivityApply(){
        return activityManageService.getAllActivityApply();
    }

    /**
     * 查询志愿者信息
     * */
    @PostMapping("/query_volunteer")
    public VolunteerDetailDto query_volunteer(@RequestBody Long id){
        return activityManageService.queryVolunteer(id);
    }
}

package com.fhf.activity_manage.controller;

import com.fhf.activity_manage.model.entity.DTO.*;
import com.fhf.activity_manage.service.VolunteerParticipationService;
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
 * @Date: 2021/03/26/9:13
 * @Description:
 */
@RestController
@RequestMapping("/volunteer_participate")
public class VolunteerParticipationController {
    @Resource
    VolunteerParticipationService volunteerParticipationService;
    //查询指定条件查询记录(志愿者 负责人都可查询)
    @PostMapping("/query_publish")
    public List<PublishActivityQueryResult> getPublishedResult(@RequestBody PublishActivityQuery publishActivityQuery){
        return volunteerParticipationService.queryPublishActivities(publishActivityQuery);
    }

    //报名参与志愿活动
    @PostMapping("/apply_activity")
    public int applyForActivity(@RequestBody ApplyForActivityDto applyForActivityDto){
        return volunteerParticipationService.applyForActivity(applyForActivityDto);
    }

    //查询志愿活动报名信息
    @PostMapping("/query_apply")
    public List<ApplyForActivityDto> getAllApply(@RequestBody Long activityId){
        return volunteerParticipationService.getAllApply(activityId);
    }

    //批准申请请求
    @PostMapping("/apply_examine")
    public void examineApply(@RequestBody ApplyExamineDto applyExamineDto){
        volunteerParticipationService.examineApply(applyExamineDto);
    }

    //评价志愿者服务参与效果
    @PostMapping("/participation_examine")
    public void participationExamine(@RequestBody ParticipationExamineDto participationExamineDto){
        volunteerParticipationService.participationExamine(participationExamineDto);
    }

    //查询所有待评价人员
    @PostMapping("/getAllParticipation")
    public List<ParticipationDto> getAllParticipation(@RequestBody Long publishActivityId){
        return volunteerParticipationService.getAllParticipation(publishActivityId);
    }

    //志愿者查询历史参与记录
    @PostMapping("/history_record")
    public List<ActivityRecordQueryResult> getHistory(@RequestBody ActivityRecordQuery activityRecordQuery){
        return volunteerParticipationService.getHistory(activityRecordQuery);
    }
}

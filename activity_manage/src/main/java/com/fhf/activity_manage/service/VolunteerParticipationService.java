package com.fhf.activity_manage.service;

import com.fhf.activity_manage.model.DTO.*;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/9:27
 * @Description: 志愿活动参与服务类
 */
public interface VolunteerParticipationService {

    /**
     * 查询志愿活动发布记录
     * @param publishActivityQuery 发布活动查询条件
     * */
    public List<PublishActivityQueryResult> queryPublishActivities(PublishActivityQuery publishActivityQuery);

    /**
     * 申请参与志愿活动
     * @param applyForActivityDto 申请活动信息
     * */
    public int applyForActivity(ApplyForActivityDto applyForActivityDto);

    /**
     * 查询指定活动的所有申请信息
     * @param activityId 发布活动Id
     * */
    public List<ApplyForActivityDto> getAllApply(Long activityId);

    /**
     * 审批申请信息
     * @param applyExamineDto 审核申请Dto
     * */
    public void examineApply(ApplyExamineDto applyExamineDto);

    /**
     * 填写评价信息
     * @param participationExamineDto 参与记录评价信息
     * */
    public void participationExamine(ParticipationExamineDto participationExamineDto);

    /**
     * 查询所有参与者信息
     * @param publishActivityId 发布活动Id
     * @return 查询的参与记录Id
     * */
    public List<ParticipationDto> getAllParticipation(Long publishActivityId);

    /**
     * 查询历史参与记录
     * @param activityRecordQuery 查询条件
     * @return 返回历史参与记录详细信息
     * */
    public  List<ActivityRecordQueryResult> getHistory(ActivityRecordQuery activityRecordQuery);
}

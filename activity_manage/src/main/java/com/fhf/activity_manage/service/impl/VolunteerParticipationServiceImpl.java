package com.fhf.activity_manage.service.impl;

import com.fhf.activity_manage.mapper.ActivityApplyMapper;
import com.fhf.activity_manage.mapper.ActivityRecordMapper;
import com.fhf.activity_manage.mapper.PublishedActivityMapper;
import com.fhf.activity_manage.model.entity.ActivityApply;
import com.fhf.activity_manage.model.entity.ActivityRecord;
import com.fhf.activity_manage.model.entity.DTO.*;
import com.fhf.activity_manage.model.entity.PublishedActivity;
import com.fhf.activity_manage.service.VolunteerParticipationService;
import com.fhf.activity_manage.util.BeanUtil;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/9:30
 * @Description:
 */
@Service
public class VolunteerParticipationServiceImpl implements VolunteerParticipationService {
    @Resource
    PublishedActivityMapper publishedActivityMapper;
    @Resource
    ActivityApplyMapper activityApplyMapper;
    @Resource
    ActivityRecordMapper activityRecordMapper;
    @Override
    public List<PublishActivityQueryResult> queryPublishActivities(PublishActivityQuery publishActivityQuery) {
        //查询未截止的报名活动
        publishActivityQuery.setIsEnd(0);
        return publishedActivityMapper.queryPublishActivity(publishActivityQuery);
    }

    @Override
    public int applyForActivity(ApplyForActivityDto applyForActivityDto) {
        ActivityApply activityApply = BeanUtil.copyProperties(applyForActivityDto,ActivityApply.class);
        //设置状态未未评价
        activityApply.setStatus(0);
        return activityApplyMapper.insertSelective(activityApply);
    }

    @Override
    public List<ApplyForActivityDto> getAllApply(Long activityId) {
        Example example = new Example(ActivityApply.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("applyFor",activityId);
        List<ActivityApply> activityApplies = activityApplyMapper.selectByExample(example);
        List<ApplyForActivityDto> result  = new ArrayList<>();
        for(int i = 0;i < activityApplies.size();i++){
            result.add(BeanUtil.copyProperties(activityApplies.get(i),ApplyForActivityDto.class));
        }
        return result;
    }

    @Override
    public void examineApply(ApplyExamineDto applyExamineDto) {
        //首先更新申请信息
        ActivityApply activityApply = BeanUtil.copyProperties(applyExamineDto, ActivityApply.class);
        activityApplyMapper.updateByPrimaryKeySelective(activityApply);
        assert activityApply != null;
        System.out.println(activityApply.getApplyId());
        activityApply = activityApplyMapper.selectByPrimaryKey(activityApply.getApplyId());
        //根据是否通过生成参与记录
        if(activityApply.getStatus() == 1){
            //生成志愿活动参与记录
            ActivityRecord activityRecord = new ActivityRecord();
            activityRecord.setParticipant(activityApply.getApplyBy());
            activityRecord.setBelongActivity(activityApply.getApplyFor());
            activityRecord.setStatus(0);
            activityRecordMapper.insertSelective(activityRecord);
            PublishedActivity publishedActivity = publishedActivityMapper.
                    selectByPrimaryKey(activityApply.getApplyFor());
            //通过报名人数增加1，如果人数已满，更新状态位置表示报名结束
            publishedActivity.setSignupNumber(publishedActivity.getSignupNumber() + 1);
            if(publishedActivity.getSignupNumber().equals(publishedActivity.getPlanNumber())){
                publishedActivity.setStatus(1);
            }
            publishedActivityMapper.updateByPrimaryKey(publishedActivity);
        }
    }

    @Override
    public void participationExamine(ParticipationExamineDto participationExamineDto) {
        ActivityRecord activityRecord = BeanUtil.copyProperties(participationExamineDto, ActivityRecord.class);
        activityRecordMapper.updateByPrimaryKeySelective(activityRecord);
    }

    @Override
    public List<ParticipationDto> getAllParticipation(Long publishActivityId) {
        return activityRecordMapper.getAllParticipation(publishActivityId);
    }

    @Override
    public List<ActivityRecordQueryResult> getHistory(ActivityRecordQuery activityRecordQuery) {

        return activityRecordMapper.getHistory(activityRecordQuery);
    }


}

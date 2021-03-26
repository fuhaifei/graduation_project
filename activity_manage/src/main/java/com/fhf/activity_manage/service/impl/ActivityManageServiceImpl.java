package com.fhf.activity_manage.service.impl;

import com.fhf.activity_manage.mapper.ActivityRecordMapper;
import com.fhf.activity_manage.mapper.PublishedActivityMapper;
import com.fhf.activity_manage.mapper.VolunteerActivityMapper;
import com.fhf.activity_manage.model.entity.ActivityRecord;
import com.fhf.activity_manage.model.DTO.*;
import com.fhf.activity_manage.model.entity.PublishedActivity;
import com.fhf.activity_manage.model.entity.VolunteerActivity;
import com.fhf.activity_manage.service.ActivityManageService;
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
 * @Date: 2021/03/24/15:21
 * @Description:
 */
@Service
public class ActivityManageServiceImpl implements ActivityManageService {
    @Resource
    public VolunteerActivityMapper volunteerActivityMapper;
    @Resource
    public PublishedActivityMapper publishedActivityMapper;
    @Resource
    public ActivityRecordMapper activityRecordMapper;

    public List<ActivityQueryResultDto> getActivity(ActivityQuery activityQuery){
        Example example = new Example(VolunteerActivity.class);
        Example.Criteria criteria = example.createCriteria();
        if(activityQuery.getActivityId() != null){
            criteria.andEqualTo("activityId",activityQuery.getActivityId());
        }
        if(activityQuery.getCategory() != null){
            criteria.andLike("category",activityQuery.getCategory());
        }
        if(activityQuery.getName() != null){
            criteria.andLike("name","%" + activityQuery.getName() + "%");
        }
        if(activityQuery.getSite() != null){
            criteria.andLike("site","%" + activityQuery.getSite() + "%");
        }
        List<VolunteerActivity> activityApplies = volunteerActivityMapper.selectByExample(example);
        List<ActivityQueryResultDto> result = new ArrayList<>();
        for(int i = 0;i < activityApplies.size();i++){
            result.add(BeanUtil.copyProperties(activityApplies.get(i),ActivityQueryResultDto.class));
        }
        return  result;
    }

    @Override
    public int addActivity(ActivityAddDto activityAddDto) {
        VolunteerActivity activity = BeanUtil.copyProperties(activityAddDto, VolunteerActivity.class);
        return  volunteerActivityMapper.insert(activity);
    }

    @Override
    public int updateActivity(ActivityUpdateDto activityUpdateDto) {
        VolunteerActivity activity = BeanUtil.copyProperties(activityUpdateDto,VolunteerActivity.class);
        return volunteerActivityMapper.updateByPrimaryKeySelective(activity);
    }

    @Override
    public String deleteActivity(Long id) {
        //首先查询判断，是否不存在发布活动信息
        Integer integer = publishedActivityMapper.countPublishRecord(id);
        if(integer != 0){
            return "存在发布记录，无法删除";
        }
        volunteerActivityMapper.deleteByPrimaryKey(id);
        return null;
    }

    @Override
    public void publishActivity(ActivityPublishDto activityPublishDto) {
        PublishedActivity publishedActivity = BeanUtil.copyProperties(activityPublishDto,PublishedActivity.class);
        publishedActivityMapper.insertSelective(publishedActivity);
    }

    @Override
    public String finishActivity(Long publishActivityId) {
        //首先查询参与记录是否均评价完成
        Example example = new Example(ActivityRecord.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("belongActivity",publishActivityId);
        criteria.andEqualTo("status",0);
        int total = activityRecordMapper.selectCountByExample(example);
        if(total != 0){
            return "评价完成才能结束活动";
        }
        //设置活动状态为已结束
        PublishedActivity publishedActivity = new PublishedActivity();
        publishedActivity.setPublishId(publishActivityId);
        publishedActivity.setStatus(2);
        publishedActivityMapper.updateByPrimaryKeySelective(publishedActivity);
        return null;
    }

}

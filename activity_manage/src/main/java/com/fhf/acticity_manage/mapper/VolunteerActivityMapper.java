package com.fhf.acticity_manage.mapper;

import com.fhf.acticity_manage.model.entity.ActivityApply;
import com.fhf.acticity_manage.model.entity.VolunteerActivity;
import org.apache.ibatis.annotations.Mapper;

import javax.management.MXBean;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:07
 * @Description: 
 */
@Mapper
public interface VolunteerActivityMapper extends BaseMapper<ActivityApply> {
    int deleteByPrimaryKey(Long activityId);

    int insert(VolunteerActivity record);

    int insertSelective(VolunteerActivity record);

    VolunteerActivity selectByPrimaryKey(Long activityId);

    int updateByPrimaryKeySelective(VolunteerActivity record);

    int updateByPrimaryKey(VolunteerActivity record);
}
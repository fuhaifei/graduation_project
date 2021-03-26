package com.fhf.activity_manage.mapper;

import com.fhf.activity_manage.model.entity.ActivityApply;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/24/16:11
 * @Description: 
 */
@Mapper
public interface ActivityApplyMapper extends BaseMapper<ActivityApply> {
    public void examineApply(ActivityApply activityApply);
}
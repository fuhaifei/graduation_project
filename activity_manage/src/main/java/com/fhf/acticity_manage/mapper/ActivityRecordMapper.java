package com.fhf.acticity_manage.mapper;

import com.fhf.acticity_manage.model.entity.ActivityApply;
import com.fhf.acticity_manage.model.entity.ActivityRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:07
 * @Description: 
 */

@Mapper
public interface ActivityRecordMapper extends BaseMapper<ActivityApply> {
    int deleteByPrimaryKey(Long recordId);

    int insert(ActivityRecord record);

    int insertSelective(ActivityRecord record);

    ActivityRecord selectByPrimaryKey(Long recordId);

    int updateByPrimaryKeySelective(ActivityRecord record);

    int updateByPrimaryKey(ActivityRecord record);
}
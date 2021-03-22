package com.fhf.acticity_manage.mapper;

import com.fhf.acticity_manage.model.entity.ActivityApply;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:07
 * @Description: 
 */

@Mapper
public interface ActivityApplyMapper extends BaseMapper<ActivityApply> {
    int deleteByPrimaryKey(Long applyId);

    int insert(ActivityApply record);

    int insertSelective(ActivityApply record);

    ActivityApply selectByPrimaryKey(Long applyId);

    int updateByPrimaryKeySelective(ActivityApply record);

    int updateByPrimaryKey(ActivityApply record);
}
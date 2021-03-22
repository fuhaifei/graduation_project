package com.fhf.acticity_manage.mapper;

import com.fhf.acticity_manage.model.entity.ActivityApply;
import com.fhf.acticity_manage.model.entity.PublishedActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:07
 * @Description: 
 */

@Mapper
public interface PublishedActivityMapper extends BaseMapper<ActivityApply>{
    int deleteByPrimaryKey(Long publishId);

    int insert(PublishedActivity record);

    int insertSelective(PublishedActivity record);

    PublishedActivity selectByPrimaryKey(Long publishId);

    int updateByPrimaryKeySelective(PublishedActivity record);

    int updateByPrimaryKey(PublishedActivity record);
}
package com.fhf.activity_manage.mapper;

import com.fhf.activity_manage.model.entity.PublishedActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/26/8:35
 * @Description: 
 */
@Mapper
public interface PublishedActivityMapper extends BaseMapper<PublishedActivity> {

    public Integer countPublishRecord(Long id);
}
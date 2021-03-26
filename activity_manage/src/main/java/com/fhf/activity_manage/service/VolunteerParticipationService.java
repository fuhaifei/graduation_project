package com.fhf.activity_manage.service;

import com.fhf.activity_manage.model.entity.DTO.PublishActivityQuery;
import com.fhf.activity_manage.model.entity.DTO.PublishActivityQueryResult;

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
     * */
    public List<PublishActivityQueryResult> queryPublishActivities(PublishActivityQuery publishActivityQuery);
}

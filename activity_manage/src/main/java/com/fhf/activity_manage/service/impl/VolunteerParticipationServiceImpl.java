package com.fhf.activity_manage.service.impl;

import com.fhf.activity_manage.mapper.PublishedActivityMapper;
import com.fhf.activity_manage.mapper.VolunteerActivityMapper;
import com.fhf.activity_manage.model.entity.DTO.PublishActivityQuery;
import com.fhf.activity_manage.model.entity.DTO.PublishActivityQueryResult;
import com.fhf.activity_manage.service.VolunteerParticipationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    VolunteerActivityMapper volunteerActivityMapper;
    @Override
    public List<PublishActivityQueryResult> queryPublishActivities(PublishActivityQuery publishActivityQuery) {
        return null;
    }
}

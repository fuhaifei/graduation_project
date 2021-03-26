package com.fhf.activity_manage.controller;

import com.fhf.activity_manage.model.entity.DTO.PublishActivityQuery;
import com.fhf.activity_manage.model.entity.DTO.PublishActivityQueryResult;
import com.fhf.activity_manage.service.VolunteerParticipationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/9:13
 * @Description:
 */
@RestController
@RequestMapping("/volunteer_participate")
public class VolunteerParticipationController {
    @Resource
    VolunteerParticipationService volunteerParticipationService;
    //查询指定条件查询记录
    @PostMapping("/query_publish")
    public List<PublishActivityQueryResult> getPublishedResult(@RequestBody PublishActivityQuery publishActivityQuery){
        return volunteerParticipationService.queryPublishActivities(publishActivityQuery);
    }
}

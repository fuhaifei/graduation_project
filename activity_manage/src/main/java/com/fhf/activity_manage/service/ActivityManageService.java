package com.fhf.activity_manage.service;
import com.fhf.activity_manage.model.entity.DTO.*;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/24/14:50
 * @Description: 志愿活动负责人管理志愿活动
 */
public interface ActivityManageService {
    /**
     * 根据查询条件查找指定条件志愿活动
     * @param activityQuery 查询条件封装类
     * @return 查询结果列表
     * */
    public List<ActivityQueryResultDto> getActivity(ActivityQuery activityQuery);

    /***
     * 添加志愿活动
     * @param activityAddDto 添加信息
     *
     * */
    public int addActivity(ActivityAddDto activityAddDto);

    /**
     * 更新志愿活动信息
     * @param  activityUpdateDto 更新信息
     * */
    public int updateActivity(ActivityUpdateDto activityUpdateDto);

    /**
     * 删除志愿活动信息
     * @param id 删除活动id
     * */
    public  String deleteActivity(Long id);

    /**
     * 发布志愿活动
     * @param activityPublishDto 发布活动信息
     * */
    public void publishActivity(ActivityPublishDto activityPublishDto);
}

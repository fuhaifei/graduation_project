package com.fhf.system_manage.service;

import com.fhf.system_manage.model.dto.NoticeQueryDto;
import com.fhf.system_manage.model.dto.NoticeQueryResultDto;
import com.fhf.system_manage.model.dto.NoticeUpdateDto;
import com.fhf.system_manage.model.dto.PublishNoticeDto;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:14
 * @Description: 公告信息管理类
 */
public interface NoticeService {

    /**
     * 新增公告信息
     * @param publishNoticeDto 发布公告信息
     * */
    public void publishNotice(PublishNoticeDto publishNoticeDto);

    /**
     * 删除公告信息
     * @param noticeId 公告Id
     * */
    public void deleteNotice(Long noticeId);

    /**
     * 更新公告信息
     * @param noticeUpdateDto 更新公告信息
     * */
    public void updateNotice(NoticeUpdateDto noticeUpdateDto);

    /**
     * 查询公告信息
     * @param
     * */
    public List<NoticeQueryResultDto> queryNotice(NoticeQueryDto noticeQueryDto);

}

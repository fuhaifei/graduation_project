package com.fhf.system_manage.controller;

import com.fhf.system_manage.model.dto.NoticeQueryDto;
import com.fhf.system_manage.model.dto.NoticeQueryResultDto;
import com.fhf.system_manage.model.dto.NoticeUpdateDto;
import com.fhf.system_manage.model.dto.PublishNoticeDto;
import com.fhf.system_manage.service.NoticeService;
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
 * @Date: 2021/03/26/19:14
 * @Description:
 */
@RestController
@RequestMapping("/system_manage")
public class NoticeController {
    @Resource
    NoticeService noticeService;

    @PostMapping("/publish_notice")
    public void publishNotice(@RequestBody PublishNoticeDto publishNoticeDto){
        noticeService.publishNotice(publishNoticeDto);
    }

    @PostMapping("/delete_notice")
    public void deleteNotice(@RequestBody Long noticeId){
        noticeService.deleteNotice(noticeId);
    }

    @PostMapping("/update_notice")
    public void updateNotice(@RequestBody NoticeUpdateDto noticeUpdateDto){
        noticeService.updateNotice(noticeUpdateDto);
    }

    @PostMapping("/query_notice")
    public List<NoticeQueryResultDto> queryNotice(@RequestBody NoticeQueryDto noticeQueryDto){
        return noticeService.queryNotice(noticeQueryDto);
    }
}

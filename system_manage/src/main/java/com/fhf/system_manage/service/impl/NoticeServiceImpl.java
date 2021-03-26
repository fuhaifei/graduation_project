package com.fhf.system_manage.service.impl;
import com.fhf.system_manage.mapper.NoticeMapper;
import com.fhf.system_manage.model.dto.NoticeQueryDto;
import com.fhf.system_manage.model.dto.NoticeQueryResultDto;
import com.fhf.system_manage.model.dto.NoticeUpdateDto;
import com.fhf.system_manage.model.dto.PublishNoticeDto;
import com.fhf.system_manage.model.entity.Notice;
import com.fhf.system_manage.service.NoticeService;
import com.fhf.system_manage.util.BeanUtil;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:23
 * @Description: 公告管理实现类
 */
@Service
public class NoticeServiceImpl implements NoticeService {
    @Resource
    NoticeMapper noticeMapper;
    @Override
    public void publishNotice(PublishNoticeDto publishNoticeDto) {
        Notice insertNotice = BeanUtil.copyProperties(publishNoticeDto,Notice.class);
        noticeMapper.insertSelective(insertNotice);
    }

    @Override
    public void deleteNotice(Long noticeId) {
        noticeMapper.deleteByPrimaryKey(noticeId);
    }

    @Override
    public void updateNotice(NoticeUpdateDto noticeUpdateDto) {
        Notice notice = BeanUtil.copyProperties(noticeUpdateDto,Notice.class);
        System.out.println(noticeUpdateDto.getNoticeId());
        noticeMapper.updateByPrimaryKeySelective(notice);
    }

    @Override
    public List<NoticeQueryResultDto> queryNotice(NoticeQueryDto noticeQueryDto) {
        Example example = new Example(Notice.class);
        Example.Criteria criteria = example.createCriteria();
        if(noticeQueryDto.getTitle() != null){
            criteria.andLike("title","%"+noticeQueryDto.getTitle()+"%");
        }
        if(noticeQueryDto.getType() != null){
            criteria.andEqualTo("type",noticeQueryDto.getType());
        }
        if(noticeQueryDto.getFromTime() != null && noticeQueryDto.getToTime() != null){
            criteria.andBetween("publishTime",noticeQueryDto.getFromTime(),noticeQueryDto.getToTime());
        }
        List<Notice> notices = noticeMapper.selectByExample(example);
        List<NoticeQueryResultDto> result = new ArrayList<>();
        for(Notice notice:notices){
            result.add(BeanUtil.copyProperties(notice,NoticeQueryResultDto.class));
        }
        return result;
    }
}

package com.fhf.system_manage.mapper;

import com.fhf.system_manage.model.entity.Notice;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:14
 * @Description: 
 */
@Mapper
public interface NoticeMapper extends BaseMapper<Notice> {
    int deleteByPrimaryKey(Long noticeId);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Long noticeId);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}
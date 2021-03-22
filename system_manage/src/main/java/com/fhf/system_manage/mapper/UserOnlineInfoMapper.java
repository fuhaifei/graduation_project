package com.fhf.system_manage.mapper;

import com.fhf.system_manage.model.entity.UserOnlineInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:14
 * @Description: 
 */
@Mapper
public interface UserOnlineInfoMapper extends BaseMapper<UserOnlineInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(UserOnlineInfo record);

    int insertSelective(UserOnlineInfo record);

    UserOnlineInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserOnlineInfo record);

    int updateByPrimaryKey(UserOnlineInfo record);
}
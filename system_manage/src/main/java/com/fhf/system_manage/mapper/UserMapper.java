package com.fhf.system_manage.mapper;

import com.fhf.system_manage.model.dto.UserQueryDto;
import com.fhf.system_manage.model.dto.UserQueryResultDto;
import com.fhf.system_manage.model.entity.User;import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:10
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    public List<UserQueryResultDto> getAllUser(UserQueryDto userQueryDto);
}
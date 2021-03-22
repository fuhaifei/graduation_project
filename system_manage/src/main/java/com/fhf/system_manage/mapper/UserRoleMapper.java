package com.fhf.system_manage.mapper;

import com.fhf.system_manage.model.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:14
 * @Description: 
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("rId") Long rId);

    int insert(UserRole record);

    int insertSelective(UserRole record);
}
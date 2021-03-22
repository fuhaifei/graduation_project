package com.fhf.system_manage.mapper;

import com.fhf.system_manage.model.entity.RoleResource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:13
 * @Description: 
 */
@Mapper
public interface RoleResourceMapper extends BaseMapper<RoleResource> {
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("resId") Long resId);

    int insert(RoleResource record);

    int insertSelective(RoleResource record);
}
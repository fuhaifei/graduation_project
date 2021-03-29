package com.fhf.system_manage.mapper;

import com.fhf.system_manage.model.entity.Resource;import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:08
 * @Description:
 */
@Mapper
public interface ResourceMapper extends BaseMapper<Resource> {

    public List<Long> getAllRoles(Long id);
}
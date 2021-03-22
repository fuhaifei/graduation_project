package com.fhf.system_manage.mapper;

import com.fhf.system_manage.model.entity.Resource;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:13
 * @Description: 
 */
@Mapper
public interface ResourceMapper extends BaseMapper<Resource> {
    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}
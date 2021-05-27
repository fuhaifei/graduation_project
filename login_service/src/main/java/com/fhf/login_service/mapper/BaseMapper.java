package com.fhf.login_service.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/22/20:09
 * @Description:
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

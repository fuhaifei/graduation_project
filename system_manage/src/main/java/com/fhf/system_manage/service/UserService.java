package com.fhf.system_manage.service;

import com.fhf.system_manage.model.dto.UserAddDto;
import com.fhf.system_manage.model.dto.UserQueryDto;
import com.fhf.system_manage.model.dto.UserQueryResultDto;
import com.fhf.system_manage.model.dto.UserUpdateDto;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/19:14
 * @Description:
 */
public interface UserService {
    /**
     * 新增资源信息
     * @param userAddDto 新增 资源信息
     * */
    public void addUser(UserAddDto userAddDto);

    /**
     * 删除资源信息
     * @param userId  资源Id
     * */
    public void deleteUser(Long userId);

    /**
     * 更新资源信息
     * @param  userUpdateDto 更新资源信息
     * */
    public void updateUser(UserUpdateDto userUpdateDto);

    /**
     * 查询资源信息
     * @param userQueryDto 资源查询信息
     * */
    public List<UserQueryResultDto> queryUser(UserQueryDto userQueryDto);
}

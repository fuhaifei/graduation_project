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
     * @param UserAddDto 新增 资源信息
     * */
    public void addUser(UserAddDto UserAddDto);

    /**
     * 删除资源信息
     * @param UserId  资源Id
     * */
    public void deleteUser(Long UserId);

    /**
     * 更新资源信息
     * @param  UserUpdateDto 更新资源信息
     * */
    public void updateUser(UserUpdateDto UserUpdateDto);

    /**
     * 查询资源信息
     * @param UserQueryDto 资源查询信息
     * */
    public List<UserQueryResultDto> queryUser(UserQueryDto UserQueryDto);
}

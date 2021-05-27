package com.fhf.activity_manage.mapper;

import com.fhf.activity_manage.model.DTO.AllActivityApplyDto;
import com.fhf.activity_manage.model.DTO.PersonalApplyDto;
import com.fhf.activity_manage.model.entity.ActivityApply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/24/16:11
 * @Description: 
 */
@Mapper
public interface ActivityApplyMapper extends BaseMapper<ActivityApply> {
    public void examineApply(ActivityApply activityApply);

    public List<PersonalApplyDto> getAllPersonalApply(Long volunteerId);

    public List<AllActivityApplyDto> getAllActivityApply();
}
package com.fhf.activity_manage.mapper;
import com.fhf.activity_manage.model.entity.ActivityRecord;
import com.fhf.activity_manage.model.entity.DTO.ActivityRecordQuery;
import com.fhf.activity_manage.model.entity.DTO.ActivityRecordQueryResult;
import com.fhf.activity_manage.model.entity.DTO.ParticipationDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 * @Auther: 付海飞
 * @Date: 2021/03/24/16:10
 * @Description: 
 */
@Mapper
public interface ActivityRecordMapper extends BaseMapper<ActivityRecord> {

    public List<ParticipationDto> getAllParticipation(Long publishActivityId);

    public List<ActivityRecordQueryResult> getHistory(ActivityRecordQuery activityRecordQuery);
}
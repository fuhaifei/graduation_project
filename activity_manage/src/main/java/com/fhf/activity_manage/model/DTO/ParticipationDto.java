package com.fhf.activity_manage.model.DTO;

import lombok.Data;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/26/16:37
 * @Description:
 */
@Data
public class ParticipationDto {
    private  Long recordId;
    private String userName;
    private Integer status;
}

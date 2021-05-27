package com.fhf.activity_manage.model.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/31/15:49
 * @Description:
 */
@Data
public class PersonalApplyDto {
    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动类型
     */
    private String category;

    private String site;

    /**
     * 申请时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime applyTime;

    /**
     * 批准人
     */
    private String approveBy;

    /**
     * 状态(是否已通过)
     */
    private Integer status;

    /**
     * 备注信息
     */
    private String note;

}

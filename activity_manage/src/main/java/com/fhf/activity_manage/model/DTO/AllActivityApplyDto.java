package com.fhf.activity_manage.model.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/04/01/16:32
 * @Description:
 */

@Data
public class AllActivityApplyDto {
    /**
     * 申请Id
     * */
    private Long applyId;
    /**
     * 申请人Id
     * */
    private Long applyBy;
    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动类型
     */
    private String category;

    /**
     * 申请时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime applyTime;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 电话
     */
    private String tel;

    /**
     * 名字
     */
    private String userName;

}

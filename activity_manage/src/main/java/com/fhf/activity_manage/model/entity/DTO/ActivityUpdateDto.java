package com.fhf.activity_manage.model.entity.DTO;
import lombok.Data;
/**
 * Created with IDEA
 * Copyright@ 东北大学 付海飞
 *
 * @Auther: 付海飞
 * @Date: 2021/03/24/17:02
 * @Description:
 */


@Data
public class ActivityUpdateDto {
    /**
     * 支援活动
     * */
    private Long activityId;
    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动类型
     */
    private String category;

    /**
     * 活动地点
     */
    private String site;

    /**
     * 活动描述
     */
    private String description;

    /**
     * 志愿时长
     */
    private Double duration;

    /**
     * 参与要求
     */
    private String require;

    /**
     * 计划招收人数
     */
    private Integer planNumber;

    /**
     * 备注
     */
    private String note;

    @Override
    public String toString() {
        return "ActivityUpdateDto{" +
                "activityId=" + activityId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", site='" + site + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", require='" + require + '\'' +
                ", planNumber=" + planNumber +
                ", note='" + note + '\'' +
                '}';
    }
}

package com.env.miniprogram.entity;

import java.util.Date;

/**
 * Created by wenjie.liu 2019-12-14  11:19
 */
public class UserDetailInfo {

    /**
     * 主键id
     */
    private int id;
    /**
     * 用户id
     */
    private int userId;
    /**
     * 记录时间
     */
    private String detailDate;
    /**
     * 体重
     */
    private int weight;
    /**
     * 体重单位
     */
    private String weightUnit;
    /**
     * 体脂数量
     */
    private float bodyFat;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    @Override
    public String toString() {
        return "UserDetailInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", detailDate=" + detailDate +
                ", weight=" + weight +
                ", weightUnit='" + weightUnit + '\'' +
                ", bodyFat=" + bodyFat +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDetailDate() {
        return detailDate;
    }

    public void setDetailDate(String detailDate) {
        this.detailDate = detailDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public float getBodyFat() {
        return bodyFat;
    }

    public void setBodyFat(float bodyFat) {
        this.bodyFat = bodyFat;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

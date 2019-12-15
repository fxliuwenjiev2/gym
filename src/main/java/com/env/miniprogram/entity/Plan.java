package com.env.miniprogram.entity;

import java.util.Date;

/**
 * Created by wenjie.liu 2019-12-14  11:12
 */
public class Plan {

    /**
     * 主键id
     */
    private int id;
    /**
     * 计划名称
     */
    private String planName;
    /**
     * 计划时间
     */
    private String planDate;
    /**
     * 用户id
     */
    private int userId;
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
        return "Plan{" +
                "id=" + id +
                ", planName='" + planName + '\'' +
                ", planDate='" + planDate + '\'' +
                ", userId=" + userId +
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

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

package com.env.miniprogram.entity;

import java.util.Date;

/**
 * Created by wenjie.liu 2019-12-14  11:06
 */
public class ActionPlan {

    /**
     * 主键id
     */
    private int id;
    /**
     * 计划id
     */
    private int planId;
    /**
     * 动作id
     */
    private int actionId;
    /**
     * 动作熟悉怒
     */
    private int actionSequence;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public int getActionSequence() {
        return actionSequence;
    }

    public void setActionSequence(int actionSequence) {
        this.actionSequence = actionSequence;
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

    @Override
    public String toString() {
        return "ActionPlan{" +
                "id=" + id +
                ", planId=" + planId +
                ", actionId=" + actionId +
                ", actionSequence=" + actionSequence +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

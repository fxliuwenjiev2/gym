package com.env.miniprogram.entity;

import java.util.Date;

/**
 * Created by wenjie.liu 2019-12-14  11:18
 */
public class UserAction {

    /**
     * 主键
     */
    private int id;
    /**
     * 用户id
     */
    private int userId;
    /**
     * 动作id
     */
    private int actionId;
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
        return "UserAction{" +
                "id=" + id +
                ", userId=" + userId +
                ", actionId=" + actionId +
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

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
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

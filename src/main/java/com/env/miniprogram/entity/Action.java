package com.env.miniprogram.entity;

import java.util.Date;

/**
 * Created by wenjie.liu 2019-12-14  10:48
 */
public class Action {

    /**
     * 主键id
     */
    private int id;
    /**
     * 动作名称
     */
    private String actionName;
    /**
     * 动作类型
     * @see com.env.miniprogram.enums.ActionTypeEnum
     */
    private int actionType;
    /**
     * 动作组数
     */
    private String groups;
    /**
     *  每组次数
     */
    private String groupTimes;
    /**
     * 重量
     */
    private String weight;
    /**
     * 重量单位 KG,磅
     */
    private String weightUnit;
    /**
     * 组间歇时长
     */
    private String restTime;
    /**
     * 动作类型：1官方动作，2自定义动作
     */
    private int common;
    /**
     * 创建时间啊
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

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public int getActionType() {
        return actionType;
    }

    public void setActionType(int actionType) {
        this.actionType = actionType;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getGroupTimes() {
        return groupTimes;
    }

    public void setGroupTimes(String groupTimes) {
        this.groupTimes = groupTimes;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getRestTime() {
        return restTime;
    }

    public void setRestTime(String restTime) {
        this.restTime = restTime;
    }

    public int getCommon() {
        return common;
    }

    public void setCommon(int common) {
        this.common = common;
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
        return "Action{" +
                "id=" + id +
                ", actionName='" + actionName + '\'' +
                ", actionType=" + actionType +
                ", group='" + groups + '\'' +
                ", groupTimes='" + groupTimes + '\'' +
                ", weight='" + weight + '\'' +
                ", weightUnit='" + weightUnit + '\'' +
                ", restTime='" + restTime + '\'' +
                ", common='" + common + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

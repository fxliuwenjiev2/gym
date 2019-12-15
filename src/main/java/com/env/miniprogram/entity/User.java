package com.env.miniprogram.entity;

import java.util.Date;

/**
 * Created by wenjie.liu 2019-12-14  11:14
 */
public class User {

    /**
     * 主键id
     */
    private int id;
    /**
     * 小程序用户id
     */
    private String openId;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 性别
     */
    private int sex;
    /**
     * 出生日期
     */
    private String birthDate;
    /**
     * 健身房id
     */
    private int gymId;
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
        return "User{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sex=" + sex +
                ", birthDate='" + birthDate + '\'' +
                ", gymId=" + gymId +
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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
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

package com.env.miniprogram.entity;

/**
 * Created by wenjie.liu 2019-12-14  11:11
 */
public class Gym {
    /**
     * 主键id
     */
    private int id;
    /**
     * 健身房民称
     */
    private String gymName;
    /**
     * 健身房地址
     */
    private String gymAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public String getGymAddress() {
        return gymAddress;
    }

    public void setGymAddress(String gymAddress) {
        this.gymAddress = gymAddress;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", gymName='" + gymName + '\'' +
                ", gymAddress='" + gymAddress + '\'' +
                '}';
    }
}

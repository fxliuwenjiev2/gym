package com.env.miniprogram.enums;

/**
 * Created by wenjie.liu 2019-12-14  10:50
 */
public enum ActionTypeEnum {
    NECK(1,"劲部"),
    SHOULDER(2,"肩部"),
    CHEST(3,"胸部"),
    ARM(4,"手臂"),
    BACK(5,"背部"),
    ABDOMEN(6,"腹部"),
    LEG(7,"腿部");

    private int type;
    private String name;

    ActionTypeEnum(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    private static String getActionType(int type){
        for (ActionTypeEnum typeEnum : values()){
            if (typeEnum.getType()  == type){
                return typeEnum.getName();
            }
        }

        return "UNKNOWN";
    }
}

package com.env.miniprogram.dao;

import com.env.miniprogram.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wenjie.liu 2019-12-14  14:25
 */
public interface UserDao {

    int insertUser(@Param("user") User user);
    int updateUser(@Param("user") User user);
    int deleteUser(@Param("id") int id);
    User queryUserByOpenId(@Param("openId") String openId);
    User queryUserById(@Param("id") int userId);


}

package com.env.miniprogram.service;

import com.env.miniprogram.dto.Result;
import com.env.miniprogram.entity.User;

/**
 * Created by wenjie.liu 2019-12-14  20:45
 */
public interface UserService {

    public Result<User> createUser(User user);
}

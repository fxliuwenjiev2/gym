package com.env.miniprogram.web.controller;

import com.env.miniprogram.dto.Result;
import com.env.miniprogram.entity.User;
import com.env.miniprogram.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wenjie.liu 2019-12-15  11:44
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;


    @RequestMapping("/createUser")
    @ResponseBody
    public Result<User> createUser(User user){

        return userService.createUser(user);
    }

    @RequestMapping("test")
    @ResponseBody
    public Result<Boolean> test(){
        return Result.makeSuccess(true);
    }
}

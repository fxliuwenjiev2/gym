package com.env.miniprogram.service.impl;

import com.env.miniprogram.dao.UserDao;
import com.env.miniprogram.dto.Result;
import com.env.miniprogram.entity.User;
import com.env.miniprogram.service.UserService;
import com.env.miniprogram.web.common.ResponseCode;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wenjie.liu 2019-12-15  10:05
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    UserDao userDao;


    public Result<User> createUser(User user) {
        if (null == user){
            return Result.makeError(ResponseCode.PARAM_INVALID,"user is null");
        }
        if (StringUtils.isBlank(user.getOpenId())){
            return Result.makeError(ResponseCode.PARAM_INVALID,"openId is invalid");
        }

        try {
            int insertRet = userDao.insertUser(user);
            if (insertRet > 0){
                User userFromDb = userDao.queryUserByOpenId(user.getOpenId());
                if (null != userFromDb){
                    return Result.makeSuccess(userFromDb);
                }
            }
        }catch (Exception e){
            logger.error("UserServiceImpl.createUser fail",e);
            return Result.makeError(ResponseCode.INTERNAL_SERVICE_FAIL,"internal service deal fail"+e.getMessage());
        }


        return Result.makeError(ResponseCode.INTERNAL_SERVICE_FAIL,"internal service fail");
    }
}

package com.env.miniprogram.dao;

import com.env.miniprogram.entity.UserAction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wenjie.liu 2019-12-14  15:37
 */
public interface UserActionDao {

    int insertUserAction(@Param("uAction") UserAction userAction);
    int deleteUserAction(@Param("userId") int userId, @Param("actionId") int actionId);
    List<UserAction> queryUserActionByUserId(@Param("userId") int userId);

}

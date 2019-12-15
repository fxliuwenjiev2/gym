package com.env.miniprogram.dao;

import com.env.miniprogram.entity.UserDetailInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wenjie.liu 2019-12-14  15:51
 */
public interface UserDetailDao {

    int insertUserDetail(@Param("userDetailInfo") UserDetailInfo userDetailInfo);
    int updateUserDetail(@Param("userDetailInfo") UserDetailInfo userDetailInfo);
    int deleteUserDetail(@Param("id") UserDetailInfo userDetailInfo);
    List<UserDetailInfo> queryUserDetailInfoByUserId(@Param("userId") int userId, @Param("beginTime") String time);
}

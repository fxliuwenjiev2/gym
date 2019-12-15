package com.env.miniprogram.dao;

import com.env.miniprogram.entity.Gym;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wenjie.liu 2019-12-14  16:28
 */
public interface GymDao {

    int insertGym(@Param("gym") Gym gym);
    int updateGym(@Param("gym") Gym gym);
    int deleteGym(@Param("id") int id);
}

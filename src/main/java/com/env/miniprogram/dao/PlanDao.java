package com.env.miniprogram.dao;

import com.env.miniprogram.entity.Plan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wenjie.liu 2019-12-14  13:49
 */
public interface PlanDao {
    int insertPlan(@Param("plan") Plan plan);
    int updatePlan(@Param("plan") Plan plan);
    int deletePlan(@Param("id") int id);
    List<Plan> queryPlanByUserId(@Param("userId") int userId);
    List<Plan> queryUserPlanByDate(@Param("date") String date, @Param("userId") int userId);
}

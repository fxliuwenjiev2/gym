package com.env.miniprogram.dao;

import com.env.miniprogram.entity.Action;
import com.env.miniprogram.entity.ActionPlan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wenjie.liu 2019-12-14  13:23
 */
public interface ActionPlanDao {

    int insertActionPlan(@Param("actionPlan") ActionPlan actionPlan);
    int updateActionPlan(@Param("actionPlan") ActionPlan actionPlan);
    int deleteActionPlan(@Param("planId") int planId);
    List<ActionPlan> queryActionPlanByPlanId(@Param("planId") int planId);
}

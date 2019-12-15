package com.env.miniprogram.dao;

import com.env.miniprogram.entity.Action;
import org.apache.ibatis.annotations.Param;
import sun.rmi.server.InactiveGroupException;

import java.util.List;

/**
 * Created by wenjie.liu 2019-12-14  11:33
 */
public interface ActionDao {

    public int insertAction(@Param("action") Action action);
    public int updateAction(@Param("action") Action action);
    public int deleteAction(@Param("id") int actionId);

    public List<Action> queryActionByIds(@Param("ids") List<Integer> ids);
}

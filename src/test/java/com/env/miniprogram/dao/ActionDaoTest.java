package com.env.miniprogram.dao;

import com.env.miniprogram.BaseTest;
import com.env.miniprogram.entity.*;
import com.env.miniprogram.enums.ActionTypeEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wenjie.liu 2019-12-14  11:59
 */
public class ActionDaoTest extends BaseTest {

    @Autowired
    ActionDao actionDao;
    @Autowired
    ActionPlanDao actionPlanDao;
    @Autowired
    PlanDao planDao;

    @Autowired
    UserDao userDao;

    @Autowired
    UserActionDao userActionDao;
    @Autowired
    UserDetailDao userDetailDao;
    @Autowired
    GymDao gymDao;

    @Test
    public void test(){
        Action action = new Action();
        action.setActionName("哑铃飞鸟");
        action.setActionType(ActionTypeEnum.CHEST.getType());
        action.setCommon(1);
        action.setGroups("4-6");
        action.setGroupTimes("8-12");
        action.setRestTime("60-120");
        action.setWeight("20-40");
        action.setWeightUnit("kg");

        int ret = actionDao.insertAction(action);
        action.setId(1);
        action.setActionName("杠铃推胸update");
        action.setCommon(1);
        action.setGroups("4-60");
        action.setGroupTimes("8-120");
        action.setRestTime("60-130");
        action.setWeight("20-400");
        action.setWeightUnit("磅");
//        int updateRet = actionDao.updateAction(action);

        List<Action> list = actionDao.queryActionByIds(Arrays.asList(1,2));
//        int ret = actionDao.deleteAction(2);
        System.out.println(1);
    }


    @Test
    public void testActionPlan(){
        ActionPlan actionPlan = new ActionPlan();
        actionPlan.setActionId(1);
        actionPlan.setActionSequence(1);
        actionPlan.setPlanId(1);

//        int insertRet = actionPlanDao.insertActionPlan(actionPlan);
//        int insertRet2 = actionPlanDao.insertActionPlan(actionPlan);
        actionPlan.setId(1);
        actionPlan.setPlanId(1);
        actionPlan.setActionSequence(2);
        actionPlan.setActionId(3);
        int updateRet = actionPlanDao.updateActionPlan(actionPlan);

        List<ActionPlan> list = actionPlanDao.queryActionPlanByPlanId(1);
        System.out.println(1);
    }

    @Test
    public void testPlan(){
        Plan plan = new Plan();
        plan.setPlanName("双12训练日");
        plan.setPlanDate("2019-12-12");
        plan.setUserId(1);
//        int insRet = planDao.insertPlan(plan);
//        plan.setPlanName("12月13训练计划");
//        plan.setPlanDate("2019-12-13");
//        insRet = 0;
//        insRet = planDao.insertPlan(plan);
//
//        plan.setPlanDate("2019-12-14");
//        plan.setId(1);
//        insRet = 0;
//        insRet = planDao.updatePlan(plan);

        List<Plan> list = planDao.queryPlanByUserId(1);
        List<Plan> list1 = planDao.queryUserPlanByDate("2019-12-13",1);
        System.out.println(1);
    }

    @Test
    public void testUserDao(){
//        User user = new User();
//        user.setAvatar("sss");
//        user.setBirthDate("2019-12-02");
//        user.setGymId(1);
//        user.setNickName("小钢炮1");
//        user.setSex(1);
//        user.setOpenId("xxx222x");
//
//        int ret = userDao.insertUser(user);
//
//
//        User userUp = new User();
//        userUp.setOpenId("updateOpne");
//        userUp.setId(1);
//        ret = userDao.updateUser(userUp);
//        userUp.setOpenId(null);
//        userUp.setSex(2);
//        ret = 0;
//        ret = userDao.updateUser(userUp);
//
//        int del = userDao.deleteUser(3);

        User user = userDao.queryUserById(1);
        User user1 = userDao.queryUserByOpenId("sss");
        System.out.println(1);

    }

    @Test
    public void testUserActionDao(){
        UserAction userAction = new UserAction();
        userAction.setActionId(1);
        userAction.setUserId(1);
        int ret = userActionDao.insertUserAction(userAction);

        userAction.setActionId(2);
        userActionDao.insertUserAction(userAction);
        List<UserAction> list = userActionDao.queryUserActionByUserId(1);

        int del = userActionDao.deleteUserAction(1,1);
        System.out.println(1);
    }

    @Test
    public void testUserDetailDao(){
        UserDetailInfo userDetailInfo = new UserDetailInfo();
        userDetailInfo.setUserId(1);
        userDetailInfo.setDetailDate("2019-12-01");
        userDetailInfo.setWeight(50);
        userDetailInfo.setWeightUnit("kg");
        userDetailInfo.setBodyFat(21.4f);

        int ret = userDetailDao.insertUserDetail(userDetailInfo);
        userDetailInfo.setDetailDate("2019-12-02");
        userDetailInfo.setWeight(70);
        userDetailInfo.setBodyFat(18.9f);
        ret = userDetailDao.insertUserDetail(userDetailInfo);
        UserDetailInfo up = new UserDetailInfo();
        up.setUserId(1);
        up.setDetailDate("2019-12-01");
        up.setWeightUnit("磅");
        int upRet = userDetailDao.updateUserDetail(up);

        List<UserDetailInfo> list = userDetailDao.queryUserDetailInfoByUserId(1,"2019-11-01");
    }

    @Test
    public void testGymDao(){
        Gym gym = new Gym();
        gym.setGymName("中田1");
        gym.setGymAddress("河定桥2");

        int ret = gymDao.insertGym(gym);

        gym.setGymAddress("河定桥1号2");
        int ret1 = gymDao.insertGym(gym);
        gym.setGymName("中田1店");
        gym.setId(1);
        int upRet = gymDao.updateGym(gym);
        int del = gymDao.deleteGym(2);
        System.out.println(1);


    }

}

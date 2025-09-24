package com.xxs.Service;

import com.xxs.Dao.IUserDao;
import com.xxs.Dao.UserDao;

public class UserService implements IUserService {

    public UserService() {
        System.out.println("UserService的无参构造");
    }

    //强关联的对象申请方法
    UserDao userDao = new UserDao();

    @Override
    public void Hello(){
        userDao.Hello();
    }

    //面相接口编程，降低一部分耦合度
    IUserDao userdao1 = new UserDao();

    //创建getter和setter方法，依赖spring注入，完全解耦合
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public IUserDao getUserdao1() {
        return userdao1;
    }

    public void setUserdao1(IUserDao userdao1) {
        this.userdao1 = userdao1;
    }
}

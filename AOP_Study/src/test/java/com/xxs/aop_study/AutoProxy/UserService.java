package com.xxs.aop_study.AutoProxy;

public class UserService implements IUserService {
    @Override
    public void add() {
        System.out.println("增加用户");
    }
}

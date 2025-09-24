package com.xxs.springbootdemo.Dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements  IUserDao{

    @Override
    public void Hello(){
        System.out.println("hello");
    }

}

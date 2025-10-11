package com.xxs.aop_study.Aspect_Demo;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }
    @Override
    public void delete() {System.out.println("删除了一个用户");}
    @Override
    public void update() {System.out.println("修改了一个用户");}
    @Override
    public Object query() {
        System.out.println("查询了一个用户");
        throw new RuntimeException("出错了！"); //创造异常
        //return null;
    }
}

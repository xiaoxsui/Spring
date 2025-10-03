package com.xxs.aop_study.StaticProxy_Demo;

//学习使用静态代理来横向扩展业务，面向切面编程
public class client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
/*        //直接调用原始业务
        userService.add();*/
        //使用代理来调用业务
        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
        proxy.delete();
    }
}

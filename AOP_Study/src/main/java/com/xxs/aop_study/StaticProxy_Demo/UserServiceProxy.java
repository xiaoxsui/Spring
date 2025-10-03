package com.xxs.aop_study.StaticProxy_Demo;

//通过中介类，在不更改原有的增删改查代码的基础上，增加额外功能
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    //当注入一个对象时，spring推荐使用set方法
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //增加一个日志方法
    public void log(String msg){
        System.out.println("调用了"+ msg +"方法");
    }
}

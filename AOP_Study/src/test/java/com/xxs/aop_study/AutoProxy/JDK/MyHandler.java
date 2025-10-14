package com.xxs.aop_study.AutoProxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

    private Object target;
    public MyHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //实现增强代码
        System.out.println("前置通知");

        //执行目标方法（反射方式），通过target调用目标方法，args内为目标方法的参数
        Object returnValue = method.invoke(target, args);

        System.out.println("后置通知");
        return returnValue;
    }
}

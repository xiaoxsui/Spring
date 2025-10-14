package com.xxs.aop_study.AutoProxy.CGlib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyCallBack implements MethodInterceptor {

    Object target;

    public MyCallBack(Object target) {
        this.target = target;
    }

    //学习CGlib动态代理，在intercept方法中对程序进行增强
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        //增强

        //前置
        System.out.println("前置");

        //目标对象-->不使用反射，直接调用父类方法（类似super.add();)
        //cglib也支持使用method.invoke()使用反射
        Object returnValue = proxy.invokeSuper(obj, args);

        //后置
        System.out.println("后置");

        return returnValue;
    }
}

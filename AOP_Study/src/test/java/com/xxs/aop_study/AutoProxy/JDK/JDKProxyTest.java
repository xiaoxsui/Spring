package com.xxs.aop_study.AutoProxy.JDK;

import com.xxs.aop_study.AutoProxy.IUserService;
import com.xxs.aop_study.AutoProxy.UserService;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class JDKProxyTest {

    @Test
    public void test(){
        IUserService UserService = (IUserService) Proxy.newProxyInstance(
                UserService.class.getClassLoader(),
                UserService.class.getInterfaces(),
                new MyHandler(new UserService())
        );
        //相当于在spring中装入UserService类 === spring(UserService)
        //查看由JDK动态代理生成出来的代理类，其实现了我们传入的IUserService接口
        System.out.println(UserService.getClass());
        UserService.add();
    }
}

package com.xxs.aop_study.AutoProxy.CGlib;

import com.xxs.aop_study.AutoProxy.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

//CGlib为第三方组件，但已经被spring整合进去了，可以直接使用
public class CGlibProxyTest {

    @Test
    public void test(){
        Enhancer enhancer = new Enhancer();

        //设置被代理的类
        enhancer.setSuperclass(UserService.class);

        //设置处理类
        enhancer.setCallback(new MyCallBack(UserService.class));

        //生成的代理类直接继承自UserService，因此无需实现接口类
        UserService service = (UserService) enhancer.create();

        System.out.println(service.getClass());
        service.add();
    }
}

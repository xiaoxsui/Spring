package com.xxs.aop_study;

import com.xxs.aop_study.Aspect_Demo.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootTest(classes = AspectTest.class)
@ComponentScan("com.xxs.aop_study.Aspect_Demo")
@EnableAspectJAutoProxy
public class AspectTest {
    @Test
    //当此处的类实现了接口时，一定要用接口来接收自动装配
    //因为AOP选择JDK动态代理时，没有接口类会报错
    public void test(@Autowired UserService userService){
        System.out.println(userService.getClass());
        userService.query();
    }
}

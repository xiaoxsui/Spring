package com.xxs.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.List;

//学习Order注解的用法

//classes参数可以指定该单元测试的配置类，来限定不必要的bean在测试时装配
@SpringBootTest(classes = OrderTest.class)
public class OrderTest {
    @Bean
//    @Order(2)   //设置order值，来设定自动注入的顺序，值越小的越在前
    public A a(){
        return new A();
    }
    @Bean
//    @Order(1)
    public B b(){
        return new B();
    }
    @Test
    public void test(@Autowired List<I> i){ //使用List来接收，可以根据<>内的类型寻找，并同时将类型的bean全部注入进来
        System.out.println(i);
    }
}

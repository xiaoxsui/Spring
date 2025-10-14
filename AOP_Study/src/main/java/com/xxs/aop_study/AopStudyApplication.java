package com.xxs.aop_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//由于这个注解起了作用，所以在使用AOP时会自动添加@EnableAspectJAutoProxy注解
//此时由该注解自动添加的@EnableAspectJAutoProxy注解，它的proxyTargetClass=true，因此底层自动使用JDK动态代理
public class AopStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopStudyApplication.class, args);
    }

}

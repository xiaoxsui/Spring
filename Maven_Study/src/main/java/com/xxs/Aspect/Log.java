package com.xxs.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

    @Before("execution(* com.xxs.Aspect.UserService.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
}

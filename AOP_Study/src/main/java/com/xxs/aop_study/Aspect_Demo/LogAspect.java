package com.xxs.aop_study.Aspect_Demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect //标记为切面类
@Component  //同时需声明为spring的bean
public class LogAspect {

    //通过切面类来实现方法用时
    @Around("execution(* com.xxs.aop_study.Aspect_Demo.UserService.*(..))")   //通知的一种，表示该切面环绕方法执行，使用切点表达式捕捉方法
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        long begin = System.currentTimeMillis();

        //执行具体的方法
        Object returnValue = joinPoint.proceed();   //可以在此获取目标方法的返回值

        long end = System.currentTimeMillis();
        System.out.println("方法用时："+ (end-begin) + "ms");

        return returnValue;
    }
}

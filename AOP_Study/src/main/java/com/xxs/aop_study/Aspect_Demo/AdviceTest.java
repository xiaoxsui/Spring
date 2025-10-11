package com.xxs.aop_study.Aspect_Demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AdviceTest {

    //学习前置通知
    //该通知类型无需手动执行目标方法
    @Before(("execution(* com.xxs.aop_study.Aspect_Demo.UserService.*(..))"))
    public void before(JoinPoint joinPoint) {
        System.out.println("该操作的方法是：" + joinPoint.getSignature().getName() + "；参数："+ Arrays.toString(joinPoint.getArgs()));

    }

    //后置通知
    //在所有代码执行最后执行，无论是否有异常都执行
    @After(("execution(* com.xxs.aop_study.Aspect_Demo.UserService.*(..))"))
    public void after(JoinPoint joinPoint){
        System.out.println("后置通知");
    }

    //返回通知
    //可以通过returning参数来获取返回值
    @AfterReturning(value = "execution(* com.xxs.aop_study.Aspect_Demo.UserService.*(..))",
    returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue){
        System.out.println("返回通知:" + returnValue);
    }

    //异常通知
    //只有在程序出现异常时才会执行
    //可以通过throwing来接收异常参数
    @AfterThrowing(value = "execution(* com.xxs.aop_study.Aspect_Demo.UserService.*(..))",
    throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint,Exception exception) {
        System.out.println("异常通知:"+exception.getMessage());
    }
}

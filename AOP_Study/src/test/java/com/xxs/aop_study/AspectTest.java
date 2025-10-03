package com.xxs.aop_study;

import com.xxs.aop_study.Aspect_Demo.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AopStudyApplication.class)
public class AspectTest {
    @Test
    public void test(@Autowired UserService userService){
        userService.add();
    }
}

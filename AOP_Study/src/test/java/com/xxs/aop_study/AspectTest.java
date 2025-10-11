package com.xxs.aop_study;

import com.xxs.aop_study.Aspect_Demo.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AspectTest {
    @Test
    public void test(@Autowired UserService userService){
        userService.query();
    }
}

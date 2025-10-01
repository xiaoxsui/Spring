package com.xxs;

import com.xxs.Service.AutowiredService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AutowiredTest {
    @Autowired
    AutowiredService autowiredService;
    @Test
    public void autowiredTest(){
        System.out.println(autowiredService);
    }
}

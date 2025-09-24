package com.xxs;

import com.xxs.Service.IAnnotateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
    @Autowired
    IAnnotateService Service;
    @Test
    public void test(){
        Service.hello();
    }
}

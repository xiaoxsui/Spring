package com.xxs;

import com.xxs.Service.IAnnotateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//添加该注解，可以使用springboot的自动装配测试功能
@SpringBootTest
public class ServiceTest {
    @Autowired
    IAnnotateService annotateService;
    @Test
    public void test(){
        annotateService.hello();
    }
}

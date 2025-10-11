package com.xxs.dependson;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

@SpringBootTest(classes = DependsOnTest.class)
public class DependsOnTest {
    @Bean
    @DependsOn("d")     //设置d为c的前置bean，这样在bean自动创建的时候d就会创建在c前
//    @DependsOn(D.class)   //也可使用bean.class的写法
    public C c(){
        return new C();
    }
    @Bean
    public D d(){
        return new D();
    }
    @Test
    public void test(){

    }

}

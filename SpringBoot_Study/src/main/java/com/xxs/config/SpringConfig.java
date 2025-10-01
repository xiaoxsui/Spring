package com.xxs.config;

import com.xxs.Service.AutowiredService;
import com.xxs.Service.AutowiredTestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

//    @Bean
    public AutowiredTestService Service2(){
        AutowiredTestService autowiredTestService = new AutowiredTestService();
        autowiredTestService.setName("@Bean");
        return autowiredTestService;

    }
}

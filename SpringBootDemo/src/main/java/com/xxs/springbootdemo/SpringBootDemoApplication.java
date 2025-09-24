package com.xxs.springbootdemo;

import com.xxs.springbootdemo.Dao.UserDao;
import com.xxs.springbootdemo.Service.AnnotateService;
import com.xxs.springbootdemo.Service.IAnnotateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ioc = SpringApplication.run(SpringBootDemoApplication.class, args);
        IAnnotateService service = ioc.getBean(IAnnotateService.class);
        service.hello();

    }

}

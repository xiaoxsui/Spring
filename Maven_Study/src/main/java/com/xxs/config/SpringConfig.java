package com.xxs.config;

import com.xxs.Dao.IUserDao;
import com.xxs.Dao.UserDao;
import com.xxs.Service.AnnotateService;
import com.xxs.Service.IAnnotateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//这个配置类就用来代替xml文件
@Configuration      // = xml的配置文件
@ComponentScan("com.xxs")      // = <context:component-scan
public class SpringConfig {

    //替代@Component注解进行spring bean类的配置
    @Bean
    public IUserDao userDao(){
        System.out.println("new UserDao()");
        return new UserDao();
    }

    @Bean
    public IAnnotateService annotateService(){
        IUserDao userDao = userDao();
        return new AnnotateService();
    }
}

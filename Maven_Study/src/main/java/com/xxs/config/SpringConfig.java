package com.xxs.config;

import com.xxs.Dao.IUserDao;
import com.xxs.Dao.UserDao;
import com.xxs.Service.AnnotateService;
import com.xxs.Service.IAnnotateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
/*配置bean的四种方式：
* @component/Configuration
* @Autowried
* @Bean
* @Import
* */


//这个配置类就用来代替xml文件
@Configuration      // = xml的配置文件
@ComponentScan("com.xxs")      // = <context:component-scan

//使用@Import进行spring bean类的注入
/*@Import(AnnotateService.class)*/
//使用ImportSelector进行批量注入
/*@Import(MyImportSelector.class)*/
//使用ImportBeanDefinitionRegistrar来根据beanDefinition注册bean
//@Import(MyImportBeanDefinitionRegistrar.class)
public class SpringConfig {

/*    //替代@Component注解进行spring bean类的配置
    @Bean
    public IUserDao userDao(){
        System.out.println("new UserDao()");
        return new UserDao();
    }

    @Bean
    public IAnnotateService annotateService(){
        IUserDao userDao = userDao();
        return new AnnotateService();
    }*/
}

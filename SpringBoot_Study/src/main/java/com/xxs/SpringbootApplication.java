package com.xxs;

import com.xxs.Service.IAnnotateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication中包含@Configuration和@ComponentScan
//当没有设置basepackages时，默认将当前注解所在类的包作为扫描包
@SpringBootApplication
public class SpringbootApplication {
    public static void main(String[] args) {
        //spring容器传入当前类，会把当前类作为配置类
        //run方法底层就会创建一个spring容器
        ConfigurableApplicationContext ioc = SpringApplication.run(SpringbootApplication.class, args);
        IAnnotateService service = ioc.getBean(IAnnotateService.class);
        service.hello();
    }
}

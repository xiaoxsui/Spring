package com.xxs;

import com.xxs.Service.AnnotateService;
import com.xxs.Service.IAnnotateService;
import com.xxs.Service.OrderService;
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

        //根据FactoryBean的类名获取的实际是getObject返回的对象
        System.out.println(ioc.getBean("orderService"));
        //根据类型获取时，依旧可以获取到该类的对象
        System.out.println(ioc.getBean(OrderService.class));
        //或者在BeanName前加上&
        System.out.println(ioc.getBean("&orderService"));
    }
}

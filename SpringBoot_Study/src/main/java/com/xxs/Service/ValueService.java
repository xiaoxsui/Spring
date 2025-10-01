package com.xxs.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//测试@Value注解的用法
@Component
//@PropertySource("xxs.properties")   //可以通过该注解来获取外部的属性文件，将数值参数统一定义在属性文件中
//当参数定义在application.properties文件中，则无需@PropertySource引用，因为该文件是springboot约定好的内置属性文件
public class ValueService {
//    @Value("xxs")   //改变在代码中写实际数值的“硬编码”写法
    @Value("${xxs.name}")
    private String name;
//    @Value("18")
    @Value("${xxs.agexx:19}")   //在没有查找到对应条目时，可以使用:设置默认值
    private Integer age;
//    @Value("${xxs.score.math}")
    private Map<String,Integer> score;
//    @Value("${xxs.habbies}")
    private List<String> hobbies;

    @Override
    public String toString() {
        return "ValueService{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", hobbies=" + hobbies +
                '}';
    }
}

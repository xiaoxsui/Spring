package com.xxs.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
/*@Primary    //将该bean设置为主要类型*/
public class AutowiredTestService {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AutowiredTestService{" +
                "name='" + name + '\'' +
                '}';
    }
}

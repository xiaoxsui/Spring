package com.xxs.order;

import org.springframework.core.Ordered;

//第二种方式，通过接口设置order
public class A implements I, Ordered {
    public A(){
        System.out.println("A");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

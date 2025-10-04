package com.xxs.dependson;

import com.xxs.order.I;
import org.springframework.core.Ordered;

//第二种方式，通过接口设置order
public class C implements I, Ordered {
    public C(){
        System.out.println("C");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

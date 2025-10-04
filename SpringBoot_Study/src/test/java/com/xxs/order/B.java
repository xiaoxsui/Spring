package com.xxs.order;

import org.springframework.core.Ordered;

public class B implements I, Ordered {
    public B(){
        System.out.println("B");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}

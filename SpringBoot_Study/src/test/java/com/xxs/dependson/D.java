package com.xxs.dependson;

import com.xxs.order.I;
import org.springframework.core.Ordered;

public class D implements I, Ordered {
    public D(){
        System.out.println("D");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}

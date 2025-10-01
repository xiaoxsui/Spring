package com.xxs.Service;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredService {
    @Autowired(required = false)    //当根据BeanName依然没有查找到Bean，可以设置required参数来停止报错
/*    @Qualifier("Service2")  //指定查找的BeanName*/
    AutowiredTestService autowiredTestService3;

    @Override
    public String toString() {
        if (autowiredTestService3 != null) {
            return "AutowiredService{" +
                    "service=" + autowiredTestService3 +
                    '}';
        }
        else
            return "null";
    }
}

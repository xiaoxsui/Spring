package com.xxs.Service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

//学习使用工厂Bean进行实例化

@Service
public class OrderService implements FactoryBean {

    //根据FactoryBean的类名获取的实际是getObject返回的对象
    @Override
    public Object getObject() throws Exception {
        return new AnnotateService();
    }

    //为FactoryBean绑定该类的类型，就可以直接通过AnnotateService类型获取FactoryBean伪装的getObject对象
    @Override
    public Class<?> getObjectType() {
        return AnnotateService.class;
    }
}

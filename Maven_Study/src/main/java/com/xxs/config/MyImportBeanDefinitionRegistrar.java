package com.xxs.config;

import com.xxs.Dao.UserDao;
import com.xxs.Service.AnnotateService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        //手动创建一个beanDefinition对象，每个bean都独立拥有一个beanDefinition对象
        RootBeanDefinition Definition = new RootBeanDefinition();
        Definition.setBeanClass(AnnotateService.class);
        //调用beanDefinition的注册器，来手动注册一个bean
        registry.registerBeanDefinition("annotateService",Definition);

    }
}

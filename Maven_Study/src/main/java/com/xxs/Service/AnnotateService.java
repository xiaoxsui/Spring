package com.xxs.Service;

import com.xxs.Dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//注解的方式实现spring的依赖注入
//@Component  //标识当前类交给spring去创建（new），交给spring进行管理，成为spring的组件——bean
public class AnnotateService implements IAnnotateService {

    @Autowired  //依赖spring自动注入userDao类
    IUserDao userDao;

    @Override
    public void hello() {
        userDao.Hello();
        System.out.println("AnnotateService");
    }
}

package com.xxs.transactionstudy.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//业务逻辑类，实现声明式事务
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    //测试声明式事务的运行：只要在方法上声明该注解，就有了事务功能
    @Transactional
    public int insert() {
        int insert = userDao.insert();
        int i = 1/0;
        return insert;
    }

}

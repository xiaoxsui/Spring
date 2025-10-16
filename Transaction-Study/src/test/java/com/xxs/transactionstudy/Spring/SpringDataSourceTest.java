package com.xxs.transactionstudy.Spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import javax.swing.*;
import java.sql.SQLException;

@SpringBootTest(classes = SpringDataSourceTest.class)
@ComponentScan
public class SpringDataSourceTest {

    @Test
    void contextLoads(@Autowired DataSource dataSource) throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    @Test
    void TestJdbcTemplate(@Autowired JdbcTemplate jdbcTemplate) throws SQLException, ClassNotFoundException {
        //可以直接使用update语句实现数据库的增删改
        jdbcTemplate.update("insert into test_user(id,name) values (?,?)","2","xxs");
    }

    //通过业务逻辑类进行单元测试
    @Test
    public void TestTransactional(@Autowired UserService service){
        service.insert();
    }
}

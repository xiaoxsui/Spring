package com.xxs.transactionstudy.Spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
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
}

package com.xxs.transactionstudy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class TransactionStudyApplicationTests {

    @Test
    void contextLoads(@Autowired DataSource dataSource) throws SQLException {
        System.out.println(dataSource.getConnection());
    }

}

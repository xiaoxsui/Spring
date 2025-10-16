package com.xxs.transactionstudy.springboot;

import com.xxs.transactionstudy.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class TransactionStudyApplicationTests {

    @Test
    void contextLoads(@Autowired DataSource dataSource) throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    //添加操作
    @Test
    void TestJdbcTemplate(@Autowired JdbcTemplate jdbcTemplate) throws SQLException, ClassNotFoundException {
        jdbcTemplate.update("insert into test_user(name) values (?)","xxs");
    }

    //删除操作
    @Test
    void TestJdbcTemplateDelete(@Autowired JdbcTemplate jdbcTemplate) throws SQLException, ClassNotFoundException {
        String sql = "delete from test_user where id=?";
        jdbcTemplate.update(sql,1);
    }

    //更改操作
    @Test
    void TestJdbcTemplateUpdate(@Autowired JdbcTemplate jdbcTemplate) throws SQLException, ClassNotFoundException {
        String sql = "update test_user set name=? where id=?";
        jdbcTemplate.update(sql,"xxs",1);
    }

    //查询操作（单个对象）
    @Test
    void TestJdbcTemplateQueryObject(@Autowired JdbcTemplate jdbcTemplate) throws SQLException, ClassNotFoundException {
        String sql = "Select * from test_user where id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }

    //查询操作（多个对象）
    @Test
    void TestJdbcTemplateQueryList(@Autowired JdbcTemplate jdbcTemplate) throws SQLException, ClassNotFoundException {
        String sql = "Select * from test_user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        System.out.println(list);
    }

    //通过业务逻辑类进行单元测试
    @Test
    public void TestTransactional(@Autowired UserService service){
        service.insert();
    }
}

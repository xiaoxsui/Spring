package com.xxs.transactionstudy.Spring;

import com.xxs.transactionstudy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//数据访问类，实现增删改查操作
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(){
        return jdbcTemplate.update("insert into test_user(name) values (?)","xxs");
    }

    public int update(){
        String sql = "update test_user set name=? where id=?";
        return jdbcTemplate.update(sql,"xxs",1);
    }

    public int delete(){
        String sql = "delete from test_user where id=?";
        return jdbcTemplate.update(sql,"xxs",1);
    }

    public User query(){
        String sql = "Select * from test_user where id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        return user;
    }
}

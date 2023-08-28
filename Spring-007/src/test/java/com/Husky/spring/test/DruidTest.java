package com.Husky.spring.test;

import com.Husky.spring.utils.DruidConnectionUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;

public class DruidTest {
    @Test
    public void testDruid(){
        Connection conn= DruidConnectionUtil.getConnection();
        System.out.println(conn);
    }
    @Test
    public void testDiDruid(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        DruidConnectionUtil druidConnectionUtil=context.getBean("druid",DruidConnectionUtil.class);
        Connection conn=druidConnectionUtil.getConnection1();
        System.out.println(conn);
    }
    @Test
    public void testTemplate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }
    @Test
    public void testInsert(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="insert into user(userName,gender,age) values (?,?,?)";
        int count=jdbcTemplate.update(sql,"霖霖","女",15);
        System.out.println(count);
    }
    @Test
    public void testDelete(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="delete from user where userName=?";
        int count=jdbcTemplate.update(sql,"霖霖");
        System.out.println(count);
    }
}

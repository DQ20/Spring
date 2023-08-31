package com.Husky.spring.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    static SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
    static InputStream is;
    static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession(){
        try {
            is=Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory=builder.build(is);
        SqlSession session=sqlSessionFactory.openSession();
        return session;
    }
    private MybatisUtil() {
    }
}

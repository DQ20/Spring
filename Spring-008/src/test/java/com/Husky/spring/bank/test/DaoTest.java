package com.Husky.spring.bank.test;

import com.Husky.spring.bank.dao.interfaces.AccDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void testDao(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bank.xml");
        AccDao accDao=applicationContext.getBean("accDao", AccDao.class);
//        int count=accDao.modify();
//        System.out.println(count);
    }
}

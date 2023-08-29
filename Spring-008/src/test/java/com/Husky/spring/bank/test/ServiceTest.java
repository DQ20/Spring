package com.Husky.spring.bank.test;

import com.Husky.spring.bank.service.interfaces.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void testService(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bank.xml");
        AccountService accountService=context.getBean("accService",AccountService.class);
        accountService.transfer("1001","1002",2000);
    }
}

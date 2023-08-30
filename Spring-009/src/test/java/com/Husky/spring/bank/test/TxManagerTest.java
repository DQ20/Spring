package com.Husky.spring.bank.test;

import com.Husky.spring.bank.service.interfaces.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxManagerTest {
    @Test
    public void testTxManager(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bank.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        try{
            accountService.transfer("1002","1001",5000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

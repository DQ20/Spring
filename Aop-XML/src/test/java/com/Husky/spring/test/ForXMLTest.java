package com.Husky.spring.test;

import com.Husky.spring.service.OrderService;
import com.Husky.spring.service.OrderServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ForXMLTest {
    @Test
    public void testForXML(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springConfig.xml");
        OrderService osi = applicationContext.getBean("osi", OrderService.class);
        osi.generate();
    }
}

package com.Husky.spring.Test;

import com.Husky.spring6.Service.userService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetInjectionTest {
    @Test
    public void di01Test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        userService cs=applicationContext.getBean("userServiceBean", userService.class);
        cs.saveCustomerDao();
    }
}

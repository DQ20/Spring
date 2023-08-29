package com.Husky.spring.test;

import com.Husky.spring.service.AnnotationConfig;
import com.Husky.spring.service.UserService;
import com.Husky.spring.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoXMLTest {
    @Test
    public void testNoXML(){
        ApplicationContext context=new AnnotationConfigApplicationContext(AnnotationConfig.class);
        UserService us=context.getBean("userServiceImpl", UserServiceImpl.class);
        us.login();
    }
}

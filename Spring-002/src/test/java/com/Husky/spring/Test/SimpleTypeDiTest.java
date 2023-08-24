package com.Husky.spring.Test;

import com.Husky.spring6.Bean.clazz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleTypeDiTest {
    @Test
    public void testStv(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        clazz c = applicationContext.getBean("clazz", clazz.class);
        System.out.println(c);
    }
}

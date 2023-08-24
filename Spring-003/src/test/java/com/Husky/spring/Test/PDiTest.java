package com.Husky.spring.Test;

import com.Husky.spring.Bean.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PDiTest {
    @Test
    public void testPDi(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring-p.xml");
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
    }
    @Test
    public void testCDi(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring-p.xml");
        Dog dog = context.getBean("dog1", Dog.class);
        System.out.println(dog);
    }
}

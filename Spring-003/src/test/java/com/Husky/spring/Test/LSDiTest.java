package com.Husky.spring.Test;

import com.Husky.spring.Bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LSDiTest {
    @Test
    public void lsDiTest(){
        ApplicationContext context= new ClassPathXmlApplicationContext("LSDi.xml");
        Person person = context.getBean("Person", Person.class);
        System.out.println(person);
    }
}

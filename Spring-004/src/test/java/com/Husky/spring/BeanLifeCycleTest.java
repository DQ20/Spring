package com.Husky.spring;

import com.Husky.spring.bean.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {
    @Test
    public void testListCycleFive(){
        ApplicationContext context=new ClassPathXmlApplicationContext("LifeCycle.xml");
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println("第四步，使用对象："+dog);
        ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) context;
        classPathXmlApplicationContext.close();
    }
}

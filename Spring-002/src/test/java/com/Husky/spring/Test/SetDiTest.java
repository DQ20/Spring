package com.Husky.spring.Test;

import com.Husky.spring6.Bean.simpleValueType;
import com.Husky.spring6.Bean.woman;
import com.Husky.spring6.jdbc.MyDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SetDiTest {
    @Test
    public void womanDiTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        woman w=applicationContext.getBean("woman",woman.class);
        System.out.println(w);
    }
    @Test
    public void simpleTypeTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        simpleValueType svt=applicationContext.getBean("svt",simpleValueType.class);
        System.out.println(svt);
    }
    @Test
    public void myDataSourceTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("jdbc.xml");
        MyDataSource ds=applicationContext.getBean("MyDataSource", MyDataSource.class);
        System.out.println(ds);
    }
}

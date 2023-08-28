package com.Husky.spring.test;

import com.Husky.spring.Bean.Person;
import com.Husky.spring.Bean.Student;
import com.Husky.spring.Bean.Teacher;
import com.Husky.spring.annotation.Component;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AnnotationTest {
    @Test
    public void testAnnotation() throws Exception{
        Class<?> clazz = Class.forName("com.Husky.spring.Bean.User");
        Component annotation;
        if(clazz.isAnnotationPresent(Component.class)){
            annotation=clazz.getAnnotation(Component.class);
            System.out.println(annotation.value());
        }
    }
    @Test
    public void testScan() throws Exception{
        Map<String,Object> map=new HashMap<>();
        String packageName="com.Husky.spring.Bean";
        String packagePath=packageName.replaceAll("\\.","/");
        System.out.println(packagePath);
        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);
        String path= url.getPath();
        System.out.println(path);
        File file=new File(path);
        File[] files=file.listFiles();
        for(File f:files){
            String className=packageName+"."+f.getName().split("\\.")[0];
            Class<?> clazz = Class.forName(className);
            if (clazz.isAnnotationPresent(Component.class)){
             Component component=clazz.getAnnotation(Component.class);
             String value=component.value();
             Object obj=clazz.getDeclaredConstructor().newInstance();
             map.put(value,obj);
            }
        }
        for (Map.Entry<String, Object> entry: map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
    @Test
    public void testSpringScan(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        Person person = applicationContext.getBean("Person", Person.class);
        Student student = applicationContext.getBean("student", Student.class);
        Teacher teacher = applicationContext.getBean("Teacher", Teacher.class);
        System.out.println(person);
        System.out.println(teacher);
        System.out.println(student);
    }
}

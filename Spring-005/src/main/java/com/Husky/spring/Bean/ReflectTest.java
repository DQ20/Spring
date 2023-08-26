package com.Husky.spring.Bean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws Exception{
        String property1="name";
        String property2="age";
        String Method1="set"+property1.toUpperCase().charAt(0)+property1.toLowerCase().substring(1);
        String Method2="set"+property2.toUpperCase().charAt(0)+property2.toLowerCase().substring(1);
        String className="com.Husky.spring.Bean.User";
        Class<?> clazz = Class.forName(className);
        Field age = clazz.getDeclaredField("age");
        Field name=clazz.getDeclaredField("name");
        Method setName = clazz.getDeclaredMethod(Method1, name.getType());
        Method setAge  = clazz.getDeclaredMethod(Method2, age.getType());
        Object o = clazz.getConstructor().newInstance();
        setName.invoke(o,"Husky");
        setAge.invoke(o,22);
        System.out.println(o);
    }
}

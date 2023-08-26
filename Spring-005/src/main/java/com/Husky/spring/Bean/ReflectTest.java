package com.Husky.spring.Bean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("com.Husky.spring.Bean.User");
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        Method setAge  = clazz.getDeclaredMethod("setAge", int.class);
        Field age = clazz.getDeclaredField("age");
        Field name=clazz.getDeclaredField("name");
        Object o = clazz.getConstructor().newInstance();
        setName.invoke(o,"Husky");
        setAge.invoke(o,22);
        System.out.println(o);
    }
}

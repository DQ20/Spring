package com.Husky.spring.Bean;

import java.util.Date;

public class Dog {
    private String name;
    private int age;
    private Date birthDay;

    public Dog() {
    }

    public Dog(String name, int age, Date birthDay) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                '}';
    }
}

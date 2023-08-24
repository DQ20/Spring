package com.Husky.spring6.Bean;

public class Student {
    private String name;
    private int age;
    private gender g;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(gender g) {
        this.g = g;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", g=" + g +
                '}';
    }

}

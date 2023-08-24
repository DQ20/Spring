package com.Husky.spring6.Bean;

public class woman {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

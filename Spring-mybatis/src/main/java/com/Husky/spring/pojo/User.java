package com.Husky.spring.pojo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


public class User {
    private String userName;
    private Integer age;
    private Character gender;

    public User() {
    }

    public User(String userName, Integer age, Character gender) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

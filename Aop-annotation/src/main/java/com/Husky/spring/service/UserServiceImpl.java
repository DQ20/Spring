package com.Husky.spring.service;

import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
    public void login(){
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("用户登录成功...");
    }
}

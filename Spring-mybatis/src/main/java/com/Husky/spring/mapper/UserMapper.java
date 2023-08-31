package com.Husky.spring.mapper;

import com.Husky.spring.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser(User user);
    List<User> selectAll();
    int deleteByUserName(User user);
    int deleteNull();
}

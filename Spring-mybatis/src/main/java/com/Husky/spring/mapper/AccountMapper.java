package com.Husky.spring.mapper;

import com.Husky.spring.pojo.Account;

import java.util.List;

public interface AccountMapper {
    int insert(Account account);
    int delete(String accNo);
    Account selectByAccNo(String accNo);
    List<Account> selectAll();
    int update(Account account);
}

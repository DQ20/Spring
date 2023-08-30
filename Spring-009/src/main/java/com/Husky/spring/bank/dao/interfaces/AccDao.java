package com.Husky.spring.bank.dao.interfaces;

import com.Husky.spring.bank.pojo.Account;

public interface AccDao {
    int insert(Account account);
    int modify(Account account);
    Account queryAccByAccNo(String accNo);
}

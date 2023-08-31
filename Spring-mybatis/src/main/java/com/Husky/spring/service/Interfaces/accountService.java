package com.Husky.spring.service.Interfaces;

import com.Husky.spring.pojo.Account;

import java.util.List;

public interface accountService {
    int addAccount(Account account);
    int deleteAccount(String accNo);
    int modifyAccount(Account account);
    Account searchAccountByAccNo(String accNo);
    List<Account> searchAll();
    void transfer(String fromAccNo,String toAccNo,Double money);
}

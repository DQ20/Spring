package com.Husky.spring.bank.service.interfaces;

public interface AccountService {
    void transfer(String fromAccNo,String toAccNo,double money);
}

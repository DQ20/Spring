package com.Husky.spring.service.Impl;

import com.Husky.spring.mapper.AccountMapper;
import com.Husky.spring.pojo.Account;
import com.Husky.spring.service.Interfaces.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("accountService")
@Transactional
public class accountServiceImpl implements accountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public int addAccount(Account account) {

        return accountMapper.insert(account);
    }

    @Override
    public int deleteAccount(String accNo) {
        return accountMapper.delete(accNo);
    }

    @Override
    public int modifyAccount(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public Account searchAccountByAccNo(String accNo) {
        return accountMapper.selectByAccNo(accNo);
    }

    @Override
    public List<Account> searchAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void transfer(String fromAccNo, String toAccNo, Double money) {
        Account fromAccount=accountMapper.selectByAccNo(fromAccNo);
        Account toAccount=accountMapper.selectByAccNo(toAccNo);
        if(money>fromAccount.getBalance()){
            throw new RuntimeException("转账失败");
        }
        fromAccount.setBalance(fromAccount.getBalance()-money);
        toAccount.setBalance(toAccount.getBalance()+money);
        int count=accountMapper.update(fromAccount);
        count+=accountMapper.update(toAccount);
        if(count!=2){
            throw new RuntimeException("转账失败");
        }
    }
}

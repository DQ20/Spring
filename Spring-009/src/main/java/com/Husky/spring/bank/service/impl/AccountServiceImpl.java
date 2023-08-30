package com.Husky.spring.bank.service.impl;

import com.Husky.spring.bank.dao.interfaces.AccDao;
import com.Husky.spring.bank.pojo.Account;
import com.Husky.spring.bank.service.interfaces.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccDao accDao;
    @Override
    public void transfer(String fromAccNo, String toAccNo, double money) {
        Account fromAccount=accDao.queryAccByAccNo(fromAccNo);
        Account toAccount=accDao.queryAccByAccNo(toAccNo);
        double fromBalance=fromAccount.getBalance();
        if(fromBalance<money){
            throw new RuntimeException("余额不足");
        }
        double toBalance=toAccount.getBalance();
       fromBalance-=money;

       toBalance+=money;
       fromAccount.setBalance(fromBalance);

       toAccount.setBalance(toBalance);
       int count=0;
       count+=accDao.modify(fromAccount);
       //模拟异常
//       String s=null;
//       s.toString();
       count+=accDao.modify(toAccount);
       if(count!=2){
           throw new RuntimeException("转账失败");
       }
       System.out.println("转账成功");
    }
}

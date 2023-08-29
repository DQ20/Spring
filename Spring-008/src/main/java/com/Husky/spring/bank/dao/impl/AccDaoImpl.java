package com.Husky.spring.bank.dao.impl;

import com.Husky.spring.bank.dao.interfaces.AccDao;
import com.Husky.spring.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccDaoImpl implements AccDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Account account) {
        String accNo= account.getAccNo();
        double balance=account.getBalance();
        String sql="insert into t_acc(accNo,balance) values(?,?)";
        return jdbcTemplate.update(sql,accNo,balance);
    }

    @Override
    public int modify(Account account) {
        String sql="update t_acc set balance=? where accNo=?";
        String accNo= account.getAccNo();
        double balance=account.getBalance();
        return jdbcTemplate.update(sql,balance,accNo);
    }

    @Override
    public Account queryAccByAccNo(String accNo) {
        String sql="select accNo,balance from t_acc where accNo=?";
        Account account=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Account.class),accNo);
        return account;
    }
}

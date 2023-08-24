package com.Husky.spring6.Dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class customerDao {
    private static final Logger logger= LoggerFactory.getLogger(customerDao.class);
    public void insert(){
        logger.info("正在保存顾客信息");
    }
}

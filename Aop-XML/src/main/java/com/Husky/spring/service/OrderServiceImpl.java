package com.Husky.spring.service;

public class OrderServiceImpl implements OrderService{
    @Override
    public void generate() {
        System.out.println("订单已生产...");
    }

    public OrderServiceImpl() {
    }
}

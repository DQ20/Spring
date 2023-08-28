package com.Husky.spring.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimerInvocationHandler implements InvocationHandler {
    private OrderService orderService;
    public TimerInvocationHandler(OrderService orderService) {
        this.orderService=orderService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Long start=System.currentTimeMillis();
        method.invoke(orderService,args);
        Long end=System.currentTimeMillis();
        System.out.println(method.getName()+"花费"+(end-start)+"毫秒");
        return null;
    }
}

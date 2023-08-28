package com.Husky.test;

import com.Husky.spring.service.OrderService;
import com.Husky.spring.service.OrderServiceImpl;
import com.Husky.spring.service.TimerInvocationHandler;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Timer;

public class ProxyTest {
    @Test
    public void testProxy(){
        OrderService target=new OrderServiceImpl();
        OrderService proxy = (OrderService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new TimerInvocationHandler(target));
        proxy.detail();
        proxy.modify();
        proxy.generate();
    }
}

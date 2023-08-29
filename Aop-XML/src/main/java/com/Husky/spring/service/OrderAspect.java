package com.Husky.spring.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("orderAspect")
public class OrderAspect {
    @Around("execution(* com.Husky.spring.service.OrderServiceImpl.generate())")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){
        System.out.println("正在生成订单...");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("订单生成完毕...");
    }
}

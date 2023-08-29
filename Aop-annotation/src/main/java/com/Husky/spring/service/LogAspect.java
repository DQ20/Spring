package com.Husky.spring.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("logAspect")
public class LogAspect {
    @Around("execution(* com.Husky.spring.service.UserServiceImpl.login())")
    public void around(ProceedingJoinPoint joinPoint){
        long start=System.currentTimeMillis();
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-start)+"毫秒");
    }
}

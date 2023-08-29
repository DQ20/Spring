package com.Husky.spring.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.Husky.spring.service")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AnnotationConfig {

}

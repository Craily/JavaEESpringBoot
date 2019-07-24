package com.example.springboot.ch01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.helloworld.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}

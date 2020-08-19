package com.hy.aop.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BrokerAspect {

    @Pointcut("@annotation(com.hy.aop.annotation.MyAnnotation)")
    public void coreBusinessCheck() {
    }


    @Before("coreBusinessCheck()")
    public void doBeforeGame() {
        System.out.println("切面业务");
    }
}
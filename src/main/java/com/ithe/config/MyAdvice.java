package com.ithe.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdvice {


    @Pointcut("execution(void com.ithe.dao.Imp.AccountDaoImp.save())")
    private void pt(){}

    @Around("pt()")
    public void getCurrentTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Long starTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
          proceedingJoinPoint.proceed();
        }

        Long endTime = System.currentTimeMillis();


        Long useTime = (endTime - starTime);
        System.out.println("useTime : ===>" + useTime);
    }
}

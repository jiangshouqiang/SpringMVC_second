package com.gr.jiang.common.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by jiang on 16/7/15.
 */
public class LogAroundAspect {
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(proceedingJoinPoint.getKind());
        for(Object obj : proceedingJoinPoint.getArgs())
            System.out.println(obj.toString());
        return proceedingJoinPoint.proceed();
    }
}

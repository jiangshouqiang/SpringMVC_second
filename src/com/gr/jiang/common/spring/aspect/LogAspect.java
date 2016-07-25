package com.gr.jiang.common.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * Created by jiang on 16/7/13.
 */
@Aspect
public class LogAspect {
//    public static void main(String [] args){
//        File file = new File(".");
//        System.out.println(file.getAbsolutePath());
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("/Users/jiang/Documents/learn/git/SpringMVC_second/web/WEB-INF/xmlConfig/aopConfig.xml");
//        System.out.println(applicationContext.getApplicationName());
//
//    }

    public void beforeHandler(){
        System.out.println("beforeHandler...");
    }
    public void afterHandler(){
        System.out.println("afterHandler...");
    }
//    @Pointcut("execution(* org.springframework.jdbc.core.JdbcTemplate.*(..))")
    @Around("execution(* org.springframework.jdbc.core.JdbcTemplate.*(..))")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(proceedingJoinPoint.toString());
        for(Object obj : proceedingJoinPoint.getArgs())
            System.out.println(obj.toString());
        return proceedingJoinPoint.proceed();
    }
    public void jdbcHandler(){
        System.out.println("jdbc...");
    }
}

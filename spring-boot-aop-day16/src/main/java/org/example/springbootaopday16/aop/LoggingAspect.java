package org.example.springbootaopday16.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    
    public static final Logger LOG = LoggerFactory.getLogger(LoggingAspect.class);
    
    // return type , classname.methodname ,arguments
    @Before("execution(* org.example.springbootaopday16.service.BookService.*(..))")
    public void logMethodCall()
    {
        LOG.info("Log method call senthil");
    }

    @Around("execution(* org.example.springbootaopday16.service.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        Thread.sleep(3000);
        Object obj = joinPoint.proceed();
        Thread.sleep(3000);
        return obj;
    }
    
}

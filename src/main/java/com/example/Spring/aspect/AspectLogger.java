package com.example.Spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogger {

/*    @Before("execution(* com.example.Spring..*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Ejecutando método " + joinPoint.getSignature().toShortString());
    }*/

}

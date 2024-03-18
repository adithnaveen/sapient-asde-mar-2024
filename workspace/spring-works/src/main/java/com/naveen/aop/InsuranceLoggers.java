package com.naveen.aop;

import com.naveen.dao.IInsuranceDAO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class InsuranceLoggers {

    @Before("execution(* com.naveen.dao.JDBCInsurance.count(..))")
    public void logBeforeCount() {
        System.out.println("-----logging before method... ");
    }

    @Before("execution(* com.naveen.dao.IInsuranceDAO.count(..))")
    public void logBeforeCount1() {
        System.out.println("-----logging before method(I)... ");
    }

    @Before("execution(public * count())")
    public void logBeforeCount2() {
        System.out.println("-----logging before method(II)... ");
    }

    @Around("execution(public * count())")
    public Object aroundExample(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before in Around ");
        System.out.println("Signature " + pjp.getSignature());

        Object  returnValue =  pjp.proceed();
        System.out.println("------------ : "+returnValue);


                // other methods
        System.out.println("After in Around ");

        return returnValue;

    }
}

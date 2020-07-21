package com.rameshit.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public void logBefore(JoinPoint joinPoint) {

		System.out.println("Before Calling : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

	public void logAfter(JoinPoint joinPoint) {

		System.out.println("After calling : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}
	
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("logAfterReturning() is running!");
		System.out.println("After Returning calling : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("******");
	}
	
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("logAfterThrowing() is running!");
		System.out.println("Throws Advice : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******");
	}
	
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() is running!");
		System.out.println("Before Calling method : " + joinPoint.getSignature().getName());
		System.out.println("arguments : " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("Around before is running!");
		joinPoint.proceed();//NOTE:To make a call to actual target object.
		System.out.println("Around after is running!");
		
		System.out.println("******");

	}
	
}
package com.rameshit.services;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("Before Calling " + methodInvocation.getMethod());
		//to send the request to the target object
//		Object object = methodInvocation.proceed();
		
		System.out.println("After Calling " + methodInvocation.getMethod());
		
		return null;
	}

}

package com.rameshit.services;

import java.lang.reflect.Method;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LoggingAfterReturningAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After calling : " + method.getName()
				+ " with arguments: " + args.length + " on : " + target + new Date());

		Logger logger = Logger.getLogger(target.getClass());
	
		logger.info("After calling : " + method.getName()
				+ " with arguments: " + args.length + " on : " + target);
		
	}
}

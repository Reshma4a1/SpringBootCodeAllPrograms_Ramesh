package com.rameshit.services;

import java.lang.reflect.Method;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class LoggingBeforeAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {

		System.out.println("Before calling : " + method.getName()
				+ " with arguments: " + args.length + " on : " + target +" --- " + new Date());

		Logger logger = Logger.getLogger(target.getClass());
		
		logger.info("Before calling : " + method.getName()
				+ " with arguments: " + args.length + " on : " + target);

	}
}

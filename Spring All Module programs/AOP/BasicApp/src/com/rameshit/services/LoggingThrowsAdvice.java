package com.rameshit.services;


import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class LoggingThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("LoggingThrowsAdvice : Throw exception called: " + e);
		
		Logger logger = Logger.getLogger(LoggingThrowsAdvice.class);
		
		logger.error("LoggingThrowsAdvice : Throw exception called: " + e);
		
	}
	
}

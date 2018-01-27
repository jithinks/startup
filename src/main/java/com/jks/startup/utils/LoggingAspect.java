package com.jks.startup.utils;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	private static final Logger logger = Logger.getLogger(LoggingAspect.class);

	@Before("execution(* com.jks.startup.service.LoginService.validateUser(..))")
	public void logBefore(JoinPoint joinPoint) {
		logger.debug("******Validate user called: "+ joinPoint.getSignature().getName());
	}

}
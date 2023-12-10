package com.angaar.odysseia.util;

import org.apache.commons.logging.Log;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.angaar.odysseia.service.TaskService;


@Aspect
@Component
public class LoggingAspect {
	public static final Log LOGGER = org.apache.commons.logging.LogFactory.getLog(TaskService.class);
	
	@Before("execution(* com.angaar.odysseia.service.*.*(..))")
	public void beforeService() {
		System.out.println("About to execute service");
		LOGGER.info("Before execution of service");
	}
}

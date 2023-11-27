package com.example.demo.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @descriptions:所有使用@RestController注解的入参和出参
 * @author: Liu XuChao
 * @date: 2023/11/27 11:50
 * @version: 1.0
 */
@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void restController() {}

    @Around("restController()")
    public Object logAroundRestCall(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        logger.info("Method: {} | Execution Time: {} ms", joinPoint.getSignature(), executionTime);
        logMethodArguments(joinPoint);
        logMethodResult(result);

        return result;
    }

    private void logMethodArguments(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        // Log input arguments
        logger.info("Method Input Arguments:");
        for (Object arg : args) {
            logger.info(arg.toString());
        }
    }

    private void logMethodResult(Object result) {
        // Log method result
        logger.info("Method Output:");
        logger.info(result != null ? result.toString() : "null");
    }
}

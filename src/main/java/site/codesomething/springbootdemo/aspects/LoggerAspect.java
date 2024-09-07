package site.codesomething.springbootdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Around("execution(* site.codesomething.springbootdemo.beans.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        var signature = joinPoint.getSignature().toString();
        logger.info(signature + " method execution starts");

        var start = Instant.now();
        joinPoint.proceed();
        var end = Instant.now();
        var timeElapsed = Duration.between(start, end).toMillis();

        logger.info("Time took to execute the method: " + timeElapsed);
        logger.info(signature + " method execution ends");
    }

    @Before("@annotation(site.codesomething.springbootdemo.interfaces.MyLoggerAspect)")
    public void logWithAnnotation(JoinPoint joinPoint) throws Throwable {
        var signature = joinPoint.getSignature().toString();
        logger.info("logWithAnnotation method execution starts before " + signature);
    }
}

package site.codesomething.springbootdemo.interfaces;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyLoggerAspect {
}

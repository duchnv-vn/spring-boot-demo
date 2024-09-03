package site.codesomething.springbootdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "site.codesomething.springbootdemo.beans")
public class ApplicationConfig {
}

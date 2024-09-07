package site.codesomething.springbootdemo.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Vehicle {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    private String name = "default vehicle name";

    public String getName() {
        return name;
    }

    @PostConstruct
    public void initialize() {
        logger.info("Vehicle initialized");
    }

    @PreDestroy
    public void  destroy() {
        logger.info("Vehicle destroyed");
    }

    public void setName(String name) {
        this.name = name;
    }
}

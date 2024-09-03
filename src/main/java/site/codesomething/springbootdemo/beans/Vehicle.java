package site.codesomething.springbootdemo.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Name created after initialization";
    }

    @PreDestroy
    public void  destroy() {
        System.out.println("Vehicle destroyed");
    }

    public void setName(String name) {
        this.name = name;
    }
}

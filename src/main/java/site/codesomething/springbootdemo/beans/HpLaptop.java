package site.codesomething.springbootdemo.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import site.codesomething.springbootdemo.abstracts.Laptop;

@Component
@Primary
public class HpLaptop extends Laptop {
    public HpLaptop() {
        super("HP", "Laptop AAA");
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
}

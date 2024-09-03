package site.codesomething.springbootdemo.beans;

import org.springframework.stereotype.Component;
import site.codesomething.springbootdemo.abstracts.Laptop;

@Component
public class MacLaptop extends Laptop {
    public MacLaptop() {
        super("Apple", "Laptop BBB");
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
}

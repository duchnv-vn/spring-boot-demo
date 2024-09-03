package site.codesomething.springbootdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import site.codesomething.springbootdemo.abstracts.Laptop;

@Component
public class Person {
    private String name = "default person name";

    //    @Autowired // auto-wiring by class field
    private final Vehicle vehicle;

    private final Laptop laptop;

    @Autowired //auto-wiring by constructor
    public Person(Vehicle vehicle, @Qualifier("hpLaptop") Laptop laptop) {
        this.vehicle = vehicle;
        this.laptop = laptop;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Autowired // auto-wiring by setter method
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
}

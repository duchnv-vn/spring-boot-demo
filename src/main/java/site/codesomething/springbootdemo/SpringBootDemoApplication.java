package site.codesomething.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.SpringVersion;
import site.codesomething.springbootdemo.beans.Person;
import site.codesomething.springbootdemo.beans.Vehicle;
import site.codesomething.springbootdemo.config.ApplicationConfig;

import java.util.function.Supplier;

@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        System.out.println("Spring version: " + SpringVersion.getVersion());
        System.out.println("Springboot version: " + SpringBootVersion.getVersion());

        var context = SpringApplication.run(SpringBootDemoApplication.class, args);
        var vehicle = context.getBean("vehicle", Vehicle.class);
        var vehicleName = vehicle.getName();
//        System.out.println("Vehicle vehicleName is: " + vehicle.getName());

        var person = context.getBean(Person.class);
        var personName = person.getName();
//        System.out.println("Person vehicleName is: " + person.getName());
//        System.out.println("Person vehicle is: " + person.getVehicle().getName());

        context.close();

//        var context2 = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        var vehicle2 = context2.getBean(Vehicle.class);
//        System.out.println("Vehicle vehicleName is: " + vehicle2.getName());

//        var person2 = context2.getBean(Person.class);
//        System.out.println("Person vehicleName is: " + person2.getName());
//        System.out.println("Person laptop is: " + person2.getLaptop().getBrand());
//        System.out.println("Person vehicle is: " + person2.getVehicle().getName());

//        context2.close();
    }

    private static Supplier<Vehicle> vehicleSupplier() {
        return () -> {
            var vehicle = new Vehicle();
            vehicle.setName("Vehicle created by registerBean()");
            return vehicle;
        };
    }
}

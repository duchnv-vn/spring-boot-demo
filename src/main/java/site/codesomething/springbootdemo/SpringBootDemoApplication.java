package site.codesomething.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.codesomething.springbootdemo.beans.Vehicle;
import site.codesomething.springbootdemo.config.ApplicationConfig;

import java.util.function.Supplier;

@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(SpringBootDemoApplication.class, args);
        var vehicle = context.getBean("vehicle", Vehicle.class);
        System.out.println("Vehicle name is: " + vehicle.getName());
        context.close();

        var context2 = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context2.registerBean("vehicle", Vehicle.class, vehicleSupplier());
        var vehicle2 = context2.getBean(Vehicle.class);
        System.out.println("Vehicle name is: " + vehicle2.getName());
        context2.close();
    }

    private static Supplier<Vehicle> vehicleSupplier() {
        return () -> {
            var vehicle = new Vehicle();
            vehicle.setName("Vehicle created by registerBean()");
            return vehicle;
        };
    }
}

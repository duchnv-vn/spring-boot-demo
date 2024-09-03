package site.codesomething.springbootdemo.config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import site.codesomething.springbootdemo.beans.Person;
//import site.codesomething.springbootdemo.beans.Vehicle;

@Configuration
@ComponentScan(basePackages = "site.codesomething.springbootdemo.beans")
public class ApplicationConfig {
//    @Bean
//    public Vehicle vehicle() {
//        var vehicle = new Vehicle();
//        vehicle.setName("Car of Mr.AAA");
//        return vehicle;
//    }
//
//    @Bean
//    public Person person(Vehicle vehicle) {
//        var person = new Person();
//        person.setName("AAA");
////        person.setVehicle(vehicle()); // wiring by method call
//        person.setVehicle(vehicle); // wiring by method parameter
//        return person;
//    }
}

package org.example;

import org.example.transport.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Car newCar(){
        return new Car();
    }
    @Bean
    public Person newPerson(){
        return new Person(newCar());
    }
}

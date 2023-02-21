package org.example.transport;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Car implements Transport{
    @Override
    public void go(){
        System.out.println("Car go!");
    }
    @PostConstruct
    public void init(){
        System.out.println("Car: init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Car: destroy");
    }
}

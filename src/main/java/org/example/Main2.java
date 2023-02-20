package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = context1.getBean("customPerson", Person.class);
        person.sitInCar();

        context1.close();
    }

}

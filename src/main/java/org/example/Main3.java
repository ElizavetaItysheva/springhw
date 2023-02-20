package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context2.getBean("customPerson", Person.class);
        person.sitInCar();

        context2.close();
    }
}

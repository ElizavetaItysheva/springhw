package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
    public static void main(String[] args){
        // сравнение бинов со скоупом прототип
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Car car = context.getBean("customCar", Car.class);
        Car car2 = context.getBean("customCar", Car.class);

        System.out.println(car == car2);

        System.out.println(car);
        System.out.println(car2);

        context.close();
    }
}

package org.example;
import org.example.transport.Car;
import org.example.transport.Moto;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        //задания 1-4
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Moto moto = context.getBean("moto", Moto.class);
        moto.go();

        context.close();
        System.out.println("________");
// задание 5-6
        ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context1.getBean("person", Person.class);
        person.sitInTransport();

        context1.close();
        System.out.println("_________");
// задание 7
        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context2.getBean("car", Car.class);
        Car car1 = context2.getBean("car", Car.class);

        System.out.println(car == car1);
        System.out.println(car);
        System.out.println(car1);

context2.close();
        System.out.println("________");
// задание 8
        AnnotationConfigApplicationContext context3 =
                new AnnotationConfigApplicationContext(Config.class);

        Person person25 = context3.getBean("newPerson", Person.class);

        person25.sitInTransport();
        context3.close();
        System.out.println("________");

    }
}

package org.example;

import org.example.transport.Moto;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Moto moto = context.getBean("moto", Moto.class);
        Moto moto1 = context.getBean("moto", Moto.class);

        System.out.println(moto == moto1);
        System.out.println(moto);
        System.out.println(moto1);
        context.close();
    }
}

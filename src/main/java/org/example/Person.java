package org.example;
import org.example.transport.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
   private Transport transport;

   @Autowired
    public Person(@Qualifier("car") Transport transport ) {
        this.transport = transport;
    }

    public void setTransport( Transport transport) {
        this.transport = transport;
    }

    public void sitInTransport(){
        System.out.println("Владелец сел в автомобиль");
        transport.go();
    }
}

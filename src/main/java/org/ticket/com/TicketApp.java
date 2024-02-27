package org.ticket.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Controller->Service->Repository->Entity/Model

//JPA -(set of interfaces) -> ORM Hibernate <-> Database

@SpringBootApplication
public class TicketApp {

    public static void main(String[] args) {
        SpringApplication.run(TicketApp.class, args);
    }
}
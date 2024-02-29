package org.ticket.com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.ticket.com.service.TravelTicketServiceImpl;

@Configuration
public class TicketConfiguration {

    @Bean
    public TravelTicketServiceImpl travelTicketService() {
        return new TravelTicketServiceImpl();
    }
}
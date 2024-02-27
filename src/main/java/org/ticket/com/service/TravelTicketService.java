package org.ticket.com.service;

import org.ticket.com.model.TravelTicket;

import java.util.List;

public interface TravelTicketService {

    List<TravelTicket> findAll();

    List<TravelTicket> findByPeriod(String period);

    TravelTicket save(TravelTicket ticket);
}

package org.ticket.com.repository;

import org.ticket.com.model.TravelTicket;

import java.util.List;

public interface TravelTicketRepository {

    List<TravelTicket> findAll();

    TravelTicket findByPeriod(String period);
}
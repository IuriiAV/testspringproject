package org.ticket.com.service;

import org.ticket.com.model.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> findAll();

    Ticket findById(long id);

    Ticket save(Ticket ticket);

    List<Ticket> findByDestination(String destination);
}
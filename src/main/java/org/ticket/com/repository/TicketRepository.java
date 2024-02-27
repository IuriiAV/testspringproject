package org.ticket.com.repository;

import org.ticket.com.model.Ticket;

import java.util.List;

public interface TicketRepository {

    List<Ticket> findAll();

    Ticket findById(long id);

    Ticket save(Ticket ticket);

    List<Ticket> findByDestination(String destination);
}

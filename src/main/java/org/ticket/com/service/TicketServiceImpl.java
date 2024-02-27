package org.ticket.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ticket.com.model.Ticket;
import org.ticket.com.repository.TicketRepository;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository repository;

    @Override
    public List<Ticket> findAll() {
        return repository.findAll();
    }

    @Override
    public Ticket findById(long id) {
        return repository.findById(id);
    }

    @Override
    public Ticket save(Ticket ticket) {
        return repository.save(ticket);
    }

    @Override
    public List<Ticket> findByDestination(String destination) {
        return repository.findByDestination(destination);
    }
}

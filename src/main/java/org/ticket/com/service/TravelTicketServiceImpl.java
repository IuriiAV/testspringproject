package org.ticket.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ticket.com.model.TravelTicket;
import org.ticket.com.repository.TravelTicketJpaRepository;
import org.ticket.com.repository.TravelTicketRepository;

import java.util.List;

@Service
public class TravelTicketServiceImpl implements TravelTicketService {

    @Autowired
    private TravelTicketJpaRepository repository;

    @Override
    public List<TravelTicket> findAll() {
        return repository.findAll();
    }

    @Override
    public List<TravelTicket> findByPeriod(String period) {
        return repository.findAllByPeriodOrderByPriceDesc(period);
    }

    @Override
    public TravelTicket save(TravelTicket ticket) {
        return repository.save(ticket);
    }
}

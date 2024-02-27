package org.ticket.com.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ticket.com.exceptions.TravelTicketInvalidArgumentException;
import org.ticket.com.exceptions.TravelTicketNotFoundException;
import org.ticket.com.model.TravelTicket;
import org.ticket.com.repository.TravelTicketJpaRepository;
import org.ticket.com.repository.TravelTicketRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TravelTicketServiceImpl implements TravelTicketService {

    @Autowired
    private TravelTicketJpaRepository repository;

    @Override
    public List<TravelTicket> findAll() {
        return repository.findAll();
    }

    @Override
    public List<TravelTicket> findByPeriod(String period) {
        if (period == null || period.isEmpty()) {
            throw new TravelTicketInvalidArgumentException("Period value " + period + " it is not correct");
        }

        return repository.findAllByPeriodOrderByPriceDesc(period);
    }

    @Override
    public TravelTicket save(TravelTicket ticket) {
        return repository.save(ticket);
    }

    @Override
    public TravelTicket findById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new TravelTicketNotFoundException("Ticket with id " + id + " not found"));
    }
}

package org.ticket.com.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ticket.com.controller.TravelController;
import org.ticket.com.model.TravelOption;

import java.util.ArrayList;
import java.util.List;

@Service
public class TravelServiceImpl implements TravelService {

    private static final Logger log = LoggerFactory.getLogger(TravelServiceImpl.class);

    @Autowired
    private TicketService ticketService;

    @Autowired
    private TravelTicketService travelTicketService;

    public List<TravelOption> getAllTravelOptions() {
        List<TravelOption> options = new ArrayList<>();
        options.addAll(ticketService.findAll());
        options.addAll(travelTicketService.findAll());
        return options;
    }
}

package org.ticket.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ticket.com.model.TravelTicket;
import org.ticket.com.service.TravelTicketService;

import java.util.List;

//http://localhost:8080/api/travel_tickets/
//http://localhost:8080/api/travel_tickets/search?period=Month
@RestController
@RequestMapping("/api/travel_tickets")
public class TravelTicketController {

    @Autowired
    private TravelTicketService service;

    @GetMapping
    public List<TravelTicket> getAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    public List<TravelTicket> getAllByPeriod(@RequestParam(name = "Period") String period) {
        return service.findByPeriod(period);
    }

    @PostMapping
    public TravelTicket create(@RequestBody TravelTicket ticket) {
        return service.save(ticket);
    }
}

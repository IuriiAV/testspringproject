package org.ticket.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ticket.com.model.Ticket;
import org.ticket.com.service.TicketService;

import java.util.List;

//CRUD -Create,Read,Update,Delete

//RESTful
//http://localhost:8080/api/tickets/ - list all  (GET)
//http://localhost:8080/api/tickets/2 - get element by id (GET)
//http://localhost:8080/api/tickets/ - create element (POST)
//http://localhost:8080/api/tickets/search/ - get by destination


@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService service;

    @GetMapping
    public List<Ticket> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Ticket getById(@PathVariable(name = "id") int id) {
        return service.findById(id);
    }

    @PostMapping
    public Ticket create(@RequestBody Ticket ticket) {
        return service.save(ticket);
    }

    @GetMapping("/search")
    public List<Ticket> findByDestination(@RequestParam("destination") String destination) {
        return service.findByDestination(destination);
    }
}
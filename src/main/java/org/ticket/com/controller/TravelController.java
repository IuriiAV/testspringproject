package org.ticket.com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ticket.com.model.TravelOption;
import org.ticket.com.service.TravelService;

import java.util.List;

@RestController
@RequestMapping("/api/travel")
public class TravelController {

    private static final Logger log = LoggerFactory.getLogger(TravelController.class);

    @Autowired
    private TravelService service;

    @GetMapping
    public List<TravelOption> getAll() {
        return service.getAllTravelOptions();
    }

    public String handleTravelException() {
        return null;
    }

}

package org.ticket.com.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.ticket.com.exceptions.TravelTicketNotFoundException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler({TravelTicketNotFoundException.class})
    public ResponseEntity<String> handleTNOF(TravelTicketNotFoundException exception
                                     , HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Problema");
    }
}

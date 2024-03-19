package org.ticket.com.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TravelTicketNotFoundException extends RuntimeException {
    public TravelTicketNotFoundException(String message) {
        super(message);
    }
}

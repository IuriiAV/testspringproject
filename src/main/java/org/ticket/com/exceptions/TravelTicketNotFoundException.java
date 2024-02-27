package org.ticket.com.exceptions;

public class TravelTicketNotFoundException extends RuntimeException {
    public TravelTicketNotFoundException(String message) {
        super(message);
    }
}

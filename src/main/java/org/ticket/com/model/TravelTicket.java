package org.ticket.com.model;


import javax.persistence.*;

@Entity
@Table(name = "travel_ticket")
public class TravelTicket extends TravelOption {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private long id;

    @Column(name = "period")
    private String period;

    private double price;

    public TravelTicket() {
        //
    }

    public TravelTicket(long id, String period, double price) {
        this.id = id;
        this.period = period;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
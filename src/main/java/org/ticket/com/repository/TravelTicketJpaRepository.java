package org.ticket.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.ticket.com.model.TravelTicket;

import java.util.List;

@Repository
public interface TravelTicketJpaRepository extends JpaRepository<TravelTicket, Long> {

    //Select * from travel_ticket where period = :period order by price desc;
    List<TravelTicket> findAllByPeriodOrderByPriceDesc(String period);

//    @Query("SELECT tt.price FROM TravelTicket as tt where tt.id = :sss")
//    TravelTicket findBySuper(String sss);
}
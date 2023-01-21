package com.shanmukh.flightservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.shanmukh.flightservices.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}

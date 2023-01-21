package com.shanmukh.flightservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.shanmukh.flightservices.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}

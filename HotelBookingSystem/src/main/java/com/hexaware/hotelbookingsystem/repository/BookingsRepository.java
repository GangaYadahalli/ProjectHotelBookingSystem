package com.hexaware.hotelbookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.hotelbookingsystem.entities.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Integer> {

    // Fetch bookings by user ID
    List<Bookings> findByUserId(Integer userId);

    // Fetch bookings for a specific hotel
    List<Bookings> findByHotelId(Integer hotelId);

    
}


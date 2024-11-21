//package com.hexaware.hotelbookingsystem.repository;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.hexaware.hotelbookingsystem.entities.Bookings;
//import com.hexaware.hotelbookingsystem.entities.Bookings.BookingStatus;
//
//@Repository
//public interface BookingsRepository extends JpaRepository<Bookings, Integer> {
//
//    // Fetch bookings by user ID
//    List<Bookings> findByUserId(Integer userId);
//
//    // Fetch bookings for a specific hotel
//    List<Bookings> findByHotelId(Integer hotelId);
//
//    List<Bookings> findByStatus(BookingStatus status);
//
//    List<Bookings> findByRoomId(Integer roomId);
//
//    List<Bookings> findByBookingDateBetween(LocalDate startDate, LocalDate endDate);
//    
//}
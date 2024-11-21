
package com.hexaware.hotelbookingsystem.service;


import java.time.LocalDate;
import java.util.List;

import com.hexaware.hotelbookingsystem.entities.Bookings;

public interface IBookingsService {

    
    Bookings createBooking(Bookings booking);

    
    Bookings getBookingById(Integer bookingId);

  
    List<Bookings> getBookingsByUserId(Integer userId);

   
    List<Bookings> getBookingsByHotelId(Integer hotelId);

   
    Bookings updateBooking(Bookings booking);

 
    void cancelBookingById(Integer bookingId);

    
    List<Bookings> getBookingsByStatus(Bookings.BookingStatus status);

  
    List<Bookings> getBookingsByRoomId(Integer roomId);
    
    List<Bookings> getBookingsByDateRange(LocalDate startDate, LocalDate endDate);
}

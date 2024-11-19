package com.hexaware.hotelbookingsystem.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hexaware.hotelbookingsystem.entities.Bookings;
import com.hexaware.hotelbookingsystem.entities.Bookings.BookingStatus;
import com.hexaware.hotelbookingsystem.service.IBookingsService;


@RestController
@RequestMapping("/bookings")
public class BookingsController {

    @Autowired
    private IBookingsService bookingsService;

    // 1. Create a new booking
    @PostMapping
    public ResponseEntity<Bookings> createBooking(@RequestBody Bookings booking) {
        Bookings createdBooking = bookingsService.createBooking(booking);
        return new ResponseEntity<>(createdBooking, HttpStatus.CREATED);
    }

    // 2. Get booking by ID
    @GetMapping("/{bookingId}")
    public ResponseEntity<Bookings> getBookingById(@PathVariable Integer bookingId) {
        Bookings booking = bookingsService.getBookingById(bookingId);
        if (booking != null) {
            return new ResponseEntity<>(booking, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 3. Get bookings by user ID
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Bookings>> getBookingsByUserId(@PathVariable Integer userId) {
        List<Bookings> bookings = bookingsService.getBookingsByUserId(userId);
        if (bookings != null && !bookings.isEmpty()) {
            return new ResponseEntity<>(bookings, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 4. Get bookings by hotel ID
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Bookings>> getBookingsByHotelId(@PathVariable Integer hotelId) {
        List<Bookings> bookings = bookingsService.getBookingsByHotelId(hotelId);
        if (bookings != null && !bookings.isEmpty()) {
            return new ResponseEntity<>(bookings, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 5. Get bookings by date range
    @GetMapping("/daterange")
    public ResponseEntity<List<Bookings>> getBookingsByDateRange(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        List<Bookings> bookings = bookingsService.getBookingsByDateRange(startDate, endDate);
        if (bookings != null && !bookings.isEmpty()) {
            return new ResponseEntity<>(bookings, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 6. Cancel a booking by ID
    @PutMapping("/{bookingId}/cancel")
    public ResponseEntity<Void> cancelBookingById(@PathVariable Integer bookingId) {
        Bookings booking = bookingsService.getBookingById(bookingId);
        if (booking != null) {
            bookingsService.cancelBookingById(bookingId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 7. Get bookings by status
    @GetMapping("/status")
    public ResponseEntity<List<Bookings>> getBookingsByStatus(@RequestParam("status") BookingStatus status) {
        List<Bookings> bookings = bookingsService.getBookingsByStatus(status);
        if (bookings != null && !bookings.isEmpty()) {
            return new ResponseEntity<>(bookings, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
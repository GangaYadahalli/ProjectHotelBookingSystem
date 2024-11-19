package com.hexaware.hotelbookingsystem.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelbookingsystem.entities.Bookings;
import com.hexaware.hotelbookingsystem.entities.Bookings.BookingStatus;
import com.hexaware.hotelbookingsystem.repository.BookingsRepository;

@Service
public class BookingsServiceImp implements IBookingsService {

	  @Autowired
	    private BookingsRepository repo;
	  
	@Override
	public Bookings createBooking(Bookings booking) {
		// TODO Auto-generated method stub
		return repo.save(booking);
	}

	@Override
	public Bookings getBookingById(Integer bookingId) {
		// TODO Auto-generated method stub
		return repo.findById(bookingId).orElse(null);
	}

	// 3. Get bookings by user ID
    @Override
    public List<Bookings> getBookingsByUserId(Integer userId) {
        return repo.findByUserId(userId);
    }

    // 4. Get bookings by hotel ID
    @Override
    public List<Bookings> getBookingsByHotelId(Integer hotelId) {
        return repo.findByHotelId(hotelId);
    }

    // 5. Update booking details
    @Override
    public Bookings updateBooking(Bookings booking) {
        if (repo.existsById(booking.getBookingId())) {
            return repo.save(booking);
        }
        return null;
    }

    // 6. Cancel a booking by ID
    @Override
    public void cancelBookingById(Integer bookingId) {
        Optional<Bookings> optionalBooking = repo.findById(bookingId);
        optionalBooking.ifPresent(booking -> {
            booking.setBookingStatus(BookingStatus.CANCELLED);
            repo.save(booking);
        });
    }

    // 7. Get bookings by status
    @Override
    public List<Bookings> getBookingsByStatus(BookingStatus status) {
        return repo.findByStatus(status);
    }

    // 8. Get bookings by room ID
    @Override
    public List<Bookings> getBookingsByRoomId(Integer roomId) {
        return repo.findByRoomId(roomId);
    }

    // 9. Get bookings by date range
    @Override
    public List<Bookings> getBookingsByDateRange(LocalDate startDate, LocalDate endDate) {
        return repo.findByBookingDateBetween(startDate, endDate);
    }

}
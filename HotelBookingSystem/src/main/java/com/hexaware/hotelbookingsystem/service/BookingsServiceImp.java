//package com.hexaware.hotelbookingsystem.service;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.hexaware.hotelbookingsystem.entities.Bookings;
//import com.hexaware.hotelbookingsystem.entities.Bookings.BookingStatus;
//import com.hexaware.hotelbookingsystem.repository.BookingsRepository;
//
//@Service
//public class BookingsServiceImp implements IBookingsService {
//
//	  @Autowired
//	    private BookingsRepository repo;
//	  
//	@Override
//	public Bookings createBooking(Bookings booking) {
//		// TODO Auto-generated method stub
//		return repo.save(booking);
//	}
//
//	@Override
//	public Bookings getBookingById(Integer bookingId) {
//		// TODO Auto-generated method stub
//		return repo.findById(bookingId).orElse(null);
//	}
//
//
//    @Override
//    public List<Bookings> getBookingsByUserId(Integer userId) {
//        return repo.findByUserId(userId);
//    }
//
// 
//    @Override
//    public List<Bookings> getBookingsByHotelId(Integer hotelId) {
//        return repo.findByHotelId(hotelId);
//    }
//
//   
//    @Override
//    public Bookings updateBooking(Bookings booking) {
//        if (repo.existsById(booking.getBookingId())) {
//            return repo.save(booking);
//        }
//        return null;
//    }
//
//  
//    @Override
//    public void cancelBookingById(Integer bookingId) {
//        Optional<Bookings> optionalBooking = repo.findById(bookingId);
//        optionalBooking.ifPresent(booking -> {
//            booking.setBookingStatus(BookingStatus.CANCELLED);
//            repo.save(booking);
//        });
//    }
//
//   
//    @Override
//    public List<Bookings> getBookingsByStatus(BookingStatus status) {
//        return repo.findByStatus(status);
//    }
//
//    @Override
//    public List<Bookings> getBookingsByRoomId(Integer roomId) {
//        return repo.findByRoomId(roomId);
//    }
//
//    
//    @Override
//    public List<Bookings> getBookingsByDateRange(LocalDate startDate, LocalDate endDate) {
//        return repo.findByBookingDateBetween(startDate, endDate);
//    }
//
//}
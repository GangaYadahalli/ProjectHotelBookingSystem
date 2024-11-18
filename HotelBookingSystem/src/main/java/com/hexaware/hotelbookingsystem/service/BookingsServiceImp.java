package com.hexaware.hotelbookingsystem.service;

import java.time.LocalDate;
import java.util.List;

import com.hexaware.hotelbookingsystem.entities.Bookings;
import com.hexaware.hotelbookingsystem.entities.Bookings.BookingStatus;

public class BookingsServiceImp implements IBookingsService {

	@Override
	public Bookings createBooking(Bookings booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bookings getBookingById(Integer bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getBookingsByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getBookingsByHotelId(Integer hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bookings updateBooking(Bookings booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelBookingById(Integer bookingId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Bookings> getBookingsByStatus(BookingStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getBookingsByRoomId(Integer roomId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getBookingsByDateRange(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return null;
	}

}

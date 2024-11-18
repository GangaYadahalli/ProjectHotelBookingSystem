package com.hexaware.hotelbookingsystem.entity;
import java.time.LocalDate;

import jakarta.persistence.Id;

public class Bookings { 
	
	    @Id
	    private Integer bookingId; 
		
	    private LocalDate checkInDate; 
	    private LocalDate checkOutDate; 
	    private Double totalAmount; 
	    private BookingStatus bookingStatus; 
	    private LocalDate bookingDate; 
	    private Integer numberOfGuests; 
	    private String specialRequests; 
	    

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private Users user; // Many-to-One relationship with Users (for GUEST users)

	    @ManyToOne
	    @JoinColumn(name = "hotel_id")
	    private Hotels hotel; // Many-to-One relationship with Hotels

	    @ManyToOne
	    @JoinColumn(name = "room_id")
	    private Rooms room; // Many-to-One relationship with Rooms
	    // Enum for bookingStatus 

	    public enum BookingStatus { 

	        CONFIRMED, CANCELLED, PENDING 

	    }
	    
	    // Getters and Setters 
	    public Integer getBookingId() { 

	        return bookingId; 

	    } 
	    public void setBookingId(Integer bookingId) { 

	        this.bookingId = bookingId; 

	    } 
	    public Users getUser() { 

	        return user; 

	    } 
	    public void setUser(Users user) { 

	        this.user = user; 

	    } 
	    public Hotels getHotel() { 

	        return hotel; 

	    } 
	    public void setHotel(Hotels hotel) { 

	        this.hotel = hotel; 

	    } 
	    public Rooms getRoom() { 

	        return room; 
	        
	    } 
	    public void setRoom(Rooms room) { 

	        this.room = room; 

	    } 
	    public LocalDate getCheckInDate() { 

	        return checkInDate; 

	    } 
	    public void setCheckInDate(LocalDate checkInDate) { 

	        this.checkInDate = checkInDate; 

	    } 
	    public LocalDate getCheckOutDate() { 

	        return checkOutDate; 

	    } 

	    public void setCheckOutDate(LocalDate checkOutDate) { 

	        this.checkOutDate = checkOutDate; 

	    } 

	    public Double getTotalAmount() { 

	        return totalAmount; 

	    } 

	    public void setTotalAmount(Double totalAmount) { 

	        this.totalAmount = totalAmount; 

	    } 

	    public BookingStatus getBookingStatus() { 

	        return bookingStatus; 

	    } 

	    public void setBookingStatus(BookingStatus bookingStatus) { 

	        this.bookingStatus = bookingStatus; 

	    } 

	    public LocalDate getBookingDate() { 

	        return bookingDate; 

	    } 

	    public void setBookingDate(LocalDate bookingDate) { 

	        this.bookingDate = bookingDate; 

	    } 

	    public Integer getNumberOfGuests() { 

	        return numberOfGuests; 

	    } 

	    public void setNumberOfGuests(Integer numberOfGuests) { 

	        this.numberOfGuests = numberOfGuests; 

	    } 

	    public String getSpecialRequests() { 

	        return specialRequests; 

	    } 

	    public void setSpecialRequests(String specialRequests) { 

	        this.specialRequests = specialRequests; 

	    } 

	    

		public Bookings() {
			super();
		}
		public Bookings(Integer bookingId, Users user, Hotels hotel, Rooms room, LocalDate checkInDate,
				LocalDate checkOutDate, Double totalAmount, BookingStatus bookingStatus, LocalDate bookingDate,
				Integer numberOfGuests, String specialRequests) {
			super();
			this.bookingId = bookingId;
			this.user = user;
			this.hotel = hotel;
			this.room = room;
			this.checkInDate = checkInDate;
			this.checkOutDate = checkOutDate;
			this.totalAmount = totalAmount;
			this.bookingStatus = bookingStatus;
			this.bookingDate = bookingDate;
			this.numberOfGuests = numberOfGuests;
			this.specialRequests = specialRequests;
		
		} 
	    

}


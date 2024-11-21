
package com.hexaware.hotelbookingsystem.entities;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Bookings { 
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer bookingId; 
		
	    @NotNull(message = "Check-in date is mandatory")
	    @Column(nullable = false)
	    private LocalDate checkInDate; 
	    
	    @NotNull(message = "Check-out date is mandatory")
	    @Column(nullable = false)
	    private LocalDate checkOutDate; 
	    
	    @NotNull(message = "Total amount is mandatory")
	    @Column(nullable = false)
	    private Double totalAmount; 
	    
	    @NotNull(message = "Booking status is mandatory")
	    @Enumerated(EnumType.STRING) // If BookingStatus is an enum, this saves it as a String in the DB
	    @Column(nullable = false)
	    private BookingStatus bookingStatus; 
	    
	    
	    @NotNull(message = "Booking date is mandatory")
	    @Column(nullable = false)
	    private LocalDate bookingDate;

	    @NotNull(message = "Number of guests is mandatory")
	    @Column(nullable = false)
	    private Integer numberOfGuests;

	    private String specialRequests; // Optional, so no validation required

	  
	    @ManyToOne
	    @JoinColumn(name = "payment_id")
	    private Payments payment; 

	    @ManyToOne
	    @JoinColumn(name = "user_id", nullable = false)
	    private Users user; // Many-to-One relationship with Users (GUEST users)

	    @ManyToOne
	    @JoinColumn(name = "hotel_id", nullable = false)
	    private Hotels hotel; // Many-to-One relationship with Hotels

	    @ManyToOne
	    @JoinColumn(name = "room_id",referencedColumnName = "roomId", nullable = false)
	    private Rooms room; // Many-to-One relationship with Rooms
	    
	    // Enum for bookingStatus 

	    public enum BookingStatus { 

	        CONFIRMED, CANCELLED, PENDING 

	    }
	    
	    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Payments> payments; // One-to-Many relationship with Payments

	    

	    // Parameterized Constructor
	    public Bookings(Integer bookingId, LocalDate checkInDate, LocalDate checkOutDate, Integer numberOfGuests,
	                    String bookingStatus, LocalDate createdAt, Users user, Hotels hotel, Rooms room) {
	        super();
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

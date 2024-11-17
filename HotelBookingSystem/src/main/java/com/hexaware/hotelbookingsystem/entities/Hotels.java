package com.hexaware.hotelbookingsystem.entities;
	import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


	@Entity
	public class Hotels {
		
		@Id
		private Integer hotelId;                
		 private String hotelName;
		       
		 private String address;     
		 private String city;          
		 private String description;
		 private Integer contactNumber;
		 private Double rating;
		 
		 @OneToOne
		 @JoinColumn(name = "user_id") 
		 private Users user;
		 
		 @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL ,  fetch = FetchType.LAZY)
		 private List<Rooms> rooms; 

		 @OneToMany(mappedBy = "hotel" , cascade = CascadeType.ALL ,  fetch = FetchType.LAZY)
		 private List<Reviews> reviews;
		    
		 @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
		 private List<Bookings> bookings; 

		 @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
		 private List<Payments> payments; 
		 
		public Hotels() {
			super();
		}
		

		public Hotels(Integer hotelId, String hotelName, String address, String city, String description,
				Integer contactNumber, Double rating) {
			super();
			this.hotelId = hotelId;
			this.hotelName = hotelName;
			this.address = address;
			this.city = city;
			this.description = description;
			this.contactNumber = contactNumber;
			this.rating = rating;
		}


		public Integer getHotelId() {
			return hotelId;
		}


		public void setHotelId(Integer hotelId) {
			this.hotelId = hotelId;
		}


		public String getHotelName() {
			return hotelName;
		}


		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public Integer getContactNumber() {
			return contactNumber;
		}


		public void setContactNumber(Integer contactNumber) {
			this.contactNumber = contactNumber;
		}


		public Double getRating() {
			return rating;
		}


		public void setRating(Double rating) {
			this.rating = rating;
		}


		public Users getUser() {
			return user;
		}


		public void setUser(Users user) {
			this.user = user;
		}


		public List<Rooms> getRooms() {
			return rooms;
		}


		public void setRooms(List<Rooms> rooms) {
			this.rooms = rooms;
		}


		public List<Reviews> getReviews() {
			return reviews;
		}


		public void setReviews(List<Reviews> reviews) {
			this.reviews = reviews;
		}


		public List<Bookings> getBookings() {
			return bookings;
		}


		public void setBookings(List<Bookings> bookings) {
			this.bookings = bookings;
		}


		public List<Payments> getPayments() {
			return payments;
		}


		public void setPayments(List<Payments> payments) {
			this.payments = payments;
		}


		@Override
		public String toString() {
			return "Hotels [hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address + ", city=" + city
					+ ", description=" + description + ", contactNumber=" + contactNumber + ", rating=" + rating
					+ ", user=" + user + "]";
		}
		
	

}

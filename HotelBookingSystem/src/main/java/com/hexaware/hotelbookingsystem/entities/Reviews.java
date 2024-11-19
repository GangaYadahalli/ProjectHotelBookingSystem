package com.hexaware.hotelbookingsystem.entities;
	import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

	@Entity
	public class Reviews { 
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer reviewId;

	    @NotNull(message = "Rating is mandatory")
	    @Min(value = 1, message = "Rating must be at least 1")
	    @Max(value = 5, message = "Rating cannot be more than 5")
	    @Column(nullable = false)
	    private Integer rating;

	    @NotNull(message = "Review title is mandatory")
	    @Column(nullable = false)
	    private String reviewTitle;

	    private String comments; // Optional field, no validation

	    @NotNull(message = "Created at date is mandatory")
	    @Column(nullable = false)
	    private LocalDateTime createdAt;

	    private LocalDateTime updatedAt; // Optional field, no validation

	    @ManyToOne
	    @JoinColumn(name = "user_id", nullable = false)
	    private Users user; // Many-to-One relationship with Users

	    @ManyToOne
	    @JoinColumn(name = "hotel_id", nullable = false)
	    private Hotels hotel; // Many-to-One relationship with Hotels

		public Reviews() {
			super();
		}
		
		 public Reviews(Integer reviewId, Integer rating, String reviewTitle, String comments, LocalDateTime createdAt,
				LocalDateTime updatedAt, Users user, Hotels hotel) {
			super();
			this.reviewId = reviewId;
			this.rating = rating;
			this.reviewTitle = reviewTitle;
			this.comments = comments;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.user = user;
			this.hotel = hotel;
		}

		// Getters and Setters
		public Integer getReviewId() {
			return reviewId;
		}
		public void setReviewId(Integer reviewId) {
			this.reviewId = reviewId;
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
		public Integer getRating() {
			return rating;
		}
		public void setRating(Integer rating) {
			this.rating = rating;
		}
		public String getReviewTitle() {
			return reviewTitle;
		}
		public void setReviewTitle(String reviewTitle) {
			this.reviewTitle = reviewTitle;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
		public LocalDateTime getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(LocalDateTime updatedAt) {
			this.updatedAt = updatedAt;
		}
	    
	   

}
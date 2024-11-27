package com.hexaware.hotelbookingsystem.dto;

import java.time.LocalDateTime;



public class ReviewsDto {

    private Integer reviewId;
    private Integer rating;
    private String reviewTitle;
    private String comments;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer userId;
    private Integer hotelId;
    
   
    public ReviewsDto(Integer reviewId, Integer rating, String reviewTitle, String comments, LocalDateTime createdAt,
			LocalDateTime updatedAt, Integer userId, Integer hotelId) {
		super();
		this.reviewId = reviewId;
		this.rating = rating;
		this.reviewTitle = reviewTitle;
		this.comments = comments;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userId = userId;
		this.hotelId = hotelId;
	}

	// Getters and Setters
    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }
}

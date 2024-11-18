package com.hexaware.hotelbookingsystem.service;


import java.util.List;

import com.hexaware.hotelbookingsystem.entities.Reviews;

public interface IReviewsService {
    
    // Adds a new review
    Reviews addReview(Reviews review);

    // Retrieves a review by its ID
    Reviews getReviewById(Integer reviewId);

    // Retrieves all reviews for a specific hotel
    List<Reviews> getReviewsByHotelId(Integer hotelId);

    // Retrieves all reviews made by a specific user
    List<Reviews> getReviewsByUserId(Integer userId);

    // Updates a review based on review ID (returns the updated review)
    Reviews updateReview(Reviews review);

    // Deletes a review by ID
    void deleteReviewById(Integer reviewId);
    
    Double getAverageRatingByHotelId(Integer hotelId);

}


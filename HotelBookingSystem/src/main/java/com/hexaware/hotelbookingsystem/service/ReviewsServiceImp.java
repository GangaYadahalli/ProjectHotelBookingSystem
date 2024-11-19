package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelbookingsystem.entities.Reviews;
import com.hexaware.hotelbookingsystem.repository.ReviewsRepository;
import com.hexaware.hotelbookingsystem.exception.ReviewNotFoundException;
@Service
public class ReviewsServiceImp implements IReviewsService {

	  @Autowired
	    private ReviewsRepository repo;

	    // 1. Add a new review
	    @Override
	    public Reviews addReview(Reviews review) {
	        return repo.save(review); // Save review in DB
	    }

	    // 2. Get review by ID
	    @Override
	    public Reviews getReviewById(Integer reviewId) {
	        return repo.findById(reviewId).orElseThrow(() -> new ReviewNotFoundException("Review not found with ID: " + reviewId)); 
	    }

	    // 3. Get all reviews for a specific hotel
	    @Override
	    public List<Reviews> getReviewsByHotelId(Integer hotelId) {
	        return repo.findByHotelId(hotelId);
	    }

	    // 4. Get all reviews made by a specific user
	    @Override
	    public List<Reviews> getReviewsByUserId(Integer userId) {
	        return repo.findByUserId(userId);
	    }

	    // 5. Update an existing review
	    @Override
	    public Reviews updateReview(Reviews review) {
	        if (repo.existsById(review.getReviewId())) {
	            return repo.save(review); // Update the review
	        }
	        return null; // Return null if review does not exist
	    }

	    // 6. Delete a review by ID
	    @Override
	    public void deleteReviewById(Integer reviewId) {
	        Reviews review = repo.findById(reviewId)
	                .orElseThrow(() -> new ReviewNotFoundException("Review not found with ID: " + reviewId));
	        repo.delete(review);
	    }
	    // 7. Get the average rating for a specific hotel
	    @Override
	    public Double getAverageRatingByHotelId(Integer hotelId) {
	        return repo.getAverageRatingByHotelId(hotelId); // Retrieve average rating
	    }
}

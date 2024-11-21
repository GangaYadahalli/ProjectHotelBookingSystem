package com.hexaware.hotelbookingsystem.service;


import java.util.List;

import com.hexaware.hotelbookingsystem.entities.Reviews;

public interface IReviewsService {
    
   
    Reviews addReview(Reviews review);

    
    Reviews getReviewById(Integer reviewId);


    List<Reviews> getReviewsByHotelId(Integer hotelId);

    
    List<Reviews> getReviewsByUserId(Integer userId);

   
    Reviews updateReview(Reviews review);

 
    void deleteReviewById(Integer reviewId);
    
    Double getAverageRatingByHotelId(Integer hotelId);

}
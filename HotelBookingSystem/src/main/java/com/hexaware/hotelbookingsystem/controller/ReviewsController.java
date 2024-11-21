//package com.hexaware.hotelbookingsystem.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.hexaware.hotelbookingsystem.entities.Reviews;
//import com.hexaware.hotelbookingsystem.service.IReviewsService;
//
//
//@RestController
//@RequestMapping("/reviews")
//public class ReviewsController {
//
//    @Autowired
//    private IReviewsService reviewsService;
//
//    // 1. Add a new review
//    @PostMapping
//    public ResponseEntity<Reviews> addReview(@RequestBody Reviews review) {
//        Reviews addedReview = reviewsService.addReview(review);
//        return new ResponseEntity<>(addedReview, HttpStatus.CREATED);
//    }
//
//    // 2. Get a review by ID
//    @GetMapping("/{reviewId}")
//    public ResponseEntity<Reviews> getReviewById(@PathVariable Integer reviewId) {
//        Reviews review = reviewsService.getReviewById(reviewId);
//        if (review != null) {
//            return new ResponseEntity<>(review, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // 3. Get all reviews for a specific hotel
//    @GetMapping("/hotel/{hotelId}")
//    public ResponseEntity<List<Reviews>> getReviewsByHotelId(@PathVariable Integer hotelId) {
//        List<Reviews> reviews = reviewsService.getReviewsByHotelId(hotelId);
//        if (reviews != null && !reviews.isEmpty()) {
//            return new ResponseEntity<>(reviews, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // 4. Get all reviews by a specific user
//    @GetMapping("/user/{userId}")
//    public ResponseEntity<List<Reviews>> getReviewsByUserId(@PathVariable Integer userId) {
//        List<Reviews> reviews = reviewsService.getReviewsByUserId(userId);
//        if (reviews != null && !reviews.isEmpty()) {
//            return new ResponseEntity<>(reviews, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // 5. Update an existing review
//    @PutMapping("/{reviewId}")
//    public ResponseEntity<Reviews> updateReview(@PathVariable Integer reviewId, @RequestBody Reviews updatedReview) {
//        Reviews existingReview = reviewsService.getReviewById(reviewId);
//        if (existingReview != null) {
//            updatedReview.setReviewId(reviewId); // Ensure the ID remains unchanged
//            Reviews updated = reviewsService.updateReview(updatedReview);
//            return new ResponseEntity<>(updated, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // 6. Delete a review by ID
//    @DeleteMapping("/{reviewId}")
//    public ResponseEntity<Void> deleteReviewById(@PathVariable Integer reviewId) {
//        Reviews existingReview = reviewsService.getReviewById(reviewId);
//        if (existingReview != null) {
//            reviewsService.deleteReviewById(reviewId);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // 7. Get the average rating for a specific hotel
//    @GetMapping("/hotel/{hotelId}/average-rating")
//    public ResponseEntity<Double> getAverageRatingByHotelId(@PathVariable Integer hotelId) {
//        Double averageRating = reviewsService.getAverageRatingByHotelId(hotelId);
//        if (averageRating != null) {
//            return new ResponseEntity<>(averageRating, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//}
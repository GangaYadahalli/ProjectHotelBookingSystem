package com.hexaware.hotelbookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.hotelbookingsystem.entities.Reviews;

public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {

	List<Reviews> findByHotelId(Integer hotelId);
}

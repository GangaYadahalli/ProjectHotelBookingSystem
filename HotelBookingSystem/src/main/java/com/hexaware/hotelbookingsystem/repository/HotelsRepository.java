package com.hexaware.hotelbookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.hotelbookingsystem.entities.Hotels;


@Repository
public interface HotelsRepository extends JpaRepository<Hotels ,Integer>{
	

	List<Hotels> filterHotelsByLocation(String city);
	
	List<Hotels> filterHotelsByRating(Double rating);
	
	

}

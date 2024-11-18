package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelbookingsystem.entities.Hotels;
import com.hexaware.hotelbookingsystem.repository.HotelsRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class HotelsServiceImp implements IHotelsService {
	
	@Autowired 
	HotelsRepository repo;

	@Override
	public Hotels addHotels(Hotels hotel) {
		
		return repo.save(hotel);
	}

	@Override
	public Hotels updateHotels(Hotels hotel) {
		
		return repo.save(hotel);
	}

	@Override
	public Hotels getHotelById(Integer hotelId) {
		
		return repo.findById(hotelId).orElse(null);
	}

	@Override
	public void deleteHotelsById(Integer hotelId) {
		
		repo.deleteById(hotelId);
		
	}

	@Override
	public List<Hotels> getAllHotels() {
		
		return  repo.findAll();
	}

	@Override
	public List<Hotels> filterHotelsByLocation(String city) {
		
		return repo.filterHotelsByLocation(city);
	}

	@Override
	public List<Hotels> filterHotelsByRating(Double rating) {
		
		return repo.filterHotelsByRating(rating);
	}









}

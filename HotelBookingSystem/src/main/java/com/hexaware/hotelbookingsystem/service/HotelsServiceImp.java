package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelbookingsystem.dto.HotelsDto;
import com.hexaware.hotelbookingsystem.entities.Hotels;
import com.hexaware.hotelbookingsystem.repository.HotelsRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class HotelsServiceImp implements IHotelsService {
	
	@Autowired 
	HotelsRepository repo;

	@Override
	public Hotels addHotels(HotelsDto hotelDto) {
		Hotels hotel=new Hotels();
		
		hotel.setHotelId(hotelDto.getHotelId());
		hotel.setHotelName(hotelDto.getHotelName());
		hotel.setAddress(hotelDto.getAddress());
		hotel.setCity(hotelDto.getCity());
		hotel.setDescription(hotelDto.getDescription());
		hotel.setContactNumber(hotelDto.getContactNumber());
		hotel.setRating(hotelDto.getRating());
		//hotel.setUser(hotelDto.getUserId());
		
		
		return repo.save(hotel);
	}

	@Override
	public Hotels updateHotels(HotelsDto hotelDto) {
		
	Hotels hotel=new Hotels();
		
		hotel.setHotelId(hotelDto.getHotelId());
		hotel.setHotelName(hotelDto.getHotelName());
		hotel.setAddress(hotelDto.getAddress());
		hotel.setCity(hotelDto.getCity());
		hotel.setDescription(hotelDto.getDescription());
		hotel.setContactNumber(hotelDto.getContactNumber());
		hotel.setRating(hotelDto.getRating());
		//hotel.setUser(hotelDto.getUserId());
		
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
	public List<Hotels> getByCity(String city) {
		
		return repo.findByCity(city);
	}

	@Override
	public List<Hotels> getByRating(Double rating) {
		
		return repo.findByRating(rating);
	}



}

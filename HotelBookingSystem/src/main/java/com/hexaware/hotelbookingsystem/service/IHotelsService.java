package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import com.hexaware.hotelbookingsystem.entities.Hotels;
import com.hexaware.hotelbookingsystem.entities.Rooms;

public interface IHotelsService {
		public Hotels addHotels(Hotels hotel);
		
		public Hotels updateHotels(Hotels hotel);
		
		public Hotels getHotelById(Integer hotelId);
		
		public void deleteHotelsById(Integer hotelId);
		
		public List<Hotels> getAllHotels();
		
		public List< Hotels> filterHotelsByLocation(String city);
		
		public List<Hotels> filterHotelsByRating(Double rating);
		
	

}

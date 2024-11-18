package com.hexaware.hotelbookingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hotelbookingsystem.entities.Hotels;
import com.hexaware.hotelbookingsystem.exception.HotelNotFoundException;
import com.hexaware.hotelbookingsystem.service.IHotelsService;

@RestController
@RequestMapping("/api/hotels")
public class HotelsController {
	@Autowired
	IHotelsService service;
	
	@PostMapping("/insert")
	  public  Hotels  insert(@RequestBody Hotels hotel) {
		
		return  service.addHotels(hotel);
	  }
	@PutMapping("/update")
	  public Hotels   update(@RequestBody Hotels hotel) {
		
		  return service.updateHotels(hotel);
		  
	  }
	@DeleteMapping("/delete/{hotelId}")
	  public String   delete(@PathVariable  Integer hotelId) {
		  
		service.deleteHotelsById(hotelId);
		return "Record deleted for hotelId" +hotelId;
	  }
	  
	  @GetMapping("/getbyid/{hotelId}")
	  public  Hotels  getById(@PathVariable Integer hotelId) {
		  Hotels hotel=null;
		  hotel= service.getHotelById(hotelId);
			    if (hotel == null) {
			        throw new HotelNotFoundException();
			    }
			    return hotel;
		  
	  }
	  
	  @GetMapping("/getall")
	  public List<Hotels>  getAll(){
		  
		  return service.getAllHotels();
		  
	  }
	  @GetMapping("/filterHotelsByLocation/{city}")
	  public List<Hotels> filterHotelsByLocation(@PathVariable String city){
		  
		  return service.filterHotelsByLocation(city);
		  
	  }
	  @GetMapping("/filterHotelsByRating/{rating}")
	  public List<Hotels> filterHotelsByRating (@PathVariable Double rating){
		  
		  return service.filterHotelsByRating(rating);
		  
	  }
	  

}

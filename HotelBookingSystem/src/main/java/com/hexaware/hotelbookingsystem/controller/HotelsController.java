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

import com.hexaware.hotelbookingsystem.dto.HotelsDto;
import com.hexaware.hotelbookingsystem.entities.Hotels;
import com.hexaware.hotelbookingsystem.exception.HotelNotFoundException;
import com.hexaware.hotelbookingsystem.service.IHotelsService;

@RestController
@RequestMapping("/api/hotels")
public class HotelsController {
	@Autowired
	IHotelsService service;

	@PostMapping("/insert")
	public Hotels insert(@RequestBody HotelsDto hotelDto) {

		return service.addHotels(hotelDto);
	}

	@PutMapping("/update")
	public Hotels update(@RequestBody HotelsDto hotelDto) {

		return service.updateHotels(hotelDto);

	}

	@DeleteMapping("/delete/{hotelId}")
	public String delete(@PathVariable Integer hotelId) {

		service.deleteHotelsById(hotelId);
		return "Record deleted for hotelId" + hotelId;
	}

	@GetMapping("/getbyid/{hotelId}")
	public Hotels getById(@PathVariable Integer hotelId) {
		Hotels hotel = null;
		hotel = service.getHotelById(hotelId);
		if (hotel == null) {
			throw new HotelNotFoundException();
		}
		return hotel;

	}

	@GetMapping("/getall")
	public List<Hotels> getAll() {

		return service.getAllHotels();

	}

	@GetMapping("/getByCity/{city}")
	public List<Hotels> getByCity(@PathVariable String city) {

		return service.getByCity(city);

	}

	@GetMapping("/getByRating/{rating}")
	public List<Hotels> getByRating(@PathVariable Double rating) {

		return service.getByRating(rating);

	}

}

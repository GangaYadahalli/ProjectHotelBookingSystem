package com.hexaware.hotelbookingsystem.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.hotelbookingsystem.entities.Hotels;
import com.hexaware.hotelbookingsystem.entities.Users;

@SpringBootTest
class HotelsControllerTest {
	
	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testInsert() {
		
		Hotels hotel = new Hotels();

		ResponseEntity<Hotels>  response =  
				restTemplate.postForEntity("http://localhost:8080/api/hotels/insert", hotel, Hotels.class);

							Hotels h = response.getBody();
							
								//assertEquals(, h.getHotelId());	
		
	}

	@Test
	void testUpdate() {
		
	}

	@Test
	void testDelete() {
		
	}

	@Test
	void testGetById() {
		
	}

	@Test
	void testGetAll() {
		
	}

	@Test
	void testGetByCity() {
		
	}

	@Test
	void testGetByRating() {
		
	}

}

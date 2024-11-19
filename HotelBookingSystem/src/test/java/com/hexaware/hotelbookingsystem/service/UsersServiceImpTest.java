package com.hexaware.hotelbookingsystem.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.hotelbookingsystem.dto.UsersDto;
import com.hexaware.hotelbookingsystem.entities.Users;



@SpringBootTest
class UsersServiceImpTest {
	
	@Autowired
	IUsersService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Disabled
	void testAddUsers() {
	
		UsersDto userDto=new UsersDto();
		Users user=service.addUsers(userDto);
		
		assertNotNull(user);
	}

	@Test
	@Disabled
	void testUpdateUsers() {
		UsersDto userDto=new UsersDto();
		Users user=service.updateUsers(userDto);
		
		assertNotNull(user);
		
	}

	@Test
	@Disabled
	void testGetUsersById() {
		
		Users user = service.getUsersById(1);

		assertEquals("Ganga", user.getName());
		
	}

	@Test
	@Disabled
	void testDeleteUsersById() {
//	
//		int user=service.deleteUsersById(2);
//
//		assertNotNull(user);
		
	}

}

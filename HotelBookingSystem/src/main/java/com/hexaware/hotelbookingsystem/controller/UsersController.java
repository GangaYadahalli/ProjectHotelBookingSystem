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

import com.hexaware.hotelbookingsystem.entities.Users;
import com.hexaware.hotelbookingsystem.exception.UserNotFoundException;
import com.hexaware.hotelbookingsystem.service.IUsersService;



@RestController
@RequestMapping("/api/users")
public class UsersController {
	@Autowired
	IUsersService service;
	
	@PostMapping("/insert")
	  public  Users  insert(@RequestBody Users user) {
		
		return  service.addUsers(user);
	  }
	@PutMapping("/update")
	  public  Users    update(@RequestBody Users user) {
		
		  return service.updateUsers(user);
		  
	  }
	@DeleteMapping("/delete/{userId}")
	  public String   delete(@PathVariable  Integer userId) {
		  
		service.deleteUsersById(userId);
		return "Record deleted for UserId" +userId;
	  }
	  
	  @GetMapping("/getbyid/{userId}")
	  public  Users  getById(@PathVariable Integer userId) {
		  Users user=null;
		  user= service.getUsersById(userId);
			    if (user == null) {
			        throw new UserNotFoundException();
			    }
			    return user;
	  }
	  
	  @GetMapping("/getall")
	  public List<Users>  getAll(){
		  
		  return service.getAllUsers();
		  
	  }
	  @DeleteMapping("/delete/{name}")
	  public String   deleteByName(@PathVariable String name ) {
		  
		service.deleteByName(name);
		return "Record deleted for name " +name;
	  }
	  @PutMapping("/updatePhoneNumber/{phoneNumber}{userId}")
	  public  Users    updatePhoneNumber(@PathVariable Long phoneNumber, @PathVariable Integer userId) {
		
		  return service.updatePhoneNumber(phoneNumber, userId);
		  
	  }
	  @PutMapping("/updatePassword/{password}{userId}")
	  public  Users    updatePassword(@PathVariable String password, @PathVariable Integer userId) {
		
		  return service.updatePassword(password, userId);
		  
	  }

	  

}

package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import com.hexaware.hotelbookingsystem.entities.Users;


public interface IUsersService {
	
	
   public Users addUsers(Users user);
	
	public Users updateUsers(Users user);
	
	public Users getUsersById(Integer userId);
	
	public void deleteUsersById(Integer userId);
	
	public List<Users> getAllUsers();
	
    public void  deleteByName(String name);
	
	public Users updatePhoneNumber(Long phoneNumber ,Integer userId);
	
	public Users updatePassword(String password,Integer userId);
	

}

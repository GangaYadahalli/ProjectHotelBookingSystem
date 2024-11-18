package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelbookingsystem.entities.Users;
import com.hexaware.hotelbookingsystem.repository.UsersRepository;

import jakarta.transaction.Transactional;


@Transactional
@Service
public class UsersServiceImp implements IUsersService {
	
	@Autowired 
	UsersRepository repo;
	
	@Override
	public Users addUsers(Users user) {
		
		return repo.save(user);
	}
	

	@Override
	public Users updateUsers(Users user) {
		
		return repo.save(user);
	}

	@Override
	public Users getUsersById(Integer userId) {
		
		return repo.findById(userId).orElse(null);
	}

	@Override
	public void deleteUsersById(Integer userId) {
		
		repo.deleteById(userId);
		
	}

	@Override
	public List<Users> getAllUsers() {
		
		return repo.findAll();
	}


	@Override
	public void deleteByName(String name) {
		
		repo.deleteByName(name);
		
	}
	@Override
	public Users updatePhoneNumber(Long phoneNumber, Integer userId) {
		
		return repo.updatePhoneNumber(phoneNumber, userId);
	}

	@Override
	public Users updatePassword(String password, Integer userId) {
		
		return repo.updatePassword(password, userId);
	}



}

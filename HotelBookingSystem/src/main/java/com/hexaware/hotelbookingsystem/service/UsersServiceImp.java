package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelbookingsystem.dto.UsersDto;
import com.hexaware.hotelbookingsystem.entities.Users;
import com.hexaware.hotelbookingsystem.repository.UsersRepository;

import jakarta.transaction.Transactional;


@Transactional
@Service
public class UsersServiceImp implements IUsersService {
	
	@Autowired 
	UsersRepository repo;
	
	@Override
	public Users addUsers(UsersDto userDto) {
		
		Users user = new Users();
		
		user.setUserId(userDto.getUserId());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setName(userDto.getName());
		user.setPhoneNumber(userDto.getPhoneNumber());
		user.setDateCreated(userDto.getDateCreated());
		user.setUserrole(Users.UserRole.valueOf(userDto.getUserrole().name()));
		user.setUpdatedAt(userDto.getUpdatedAt());
		
	
		
		return repo.save(user);
	}
	

	@Override
	public Users updateUsers(UsersDto userDto) {
		
        Users user = new Users();
		
		user.setUserId(userDto.getUserId());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setName(userDto.getName());
		user.setPhoneNumber(userDto.getPhoneNumber());
		user.setDateCreated(userDto.getDateCreated());
		user.setUserrole(Users.UserRole.valueOf(userDto.getUserrole().name()));
		user.setUpdatedAt(userDto.getUpdatedAt());
		
		
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
	public int deleteByName(String name) {
		
		return repo.deleteByName(name);
	}


	@Override
	public int updatePhoneNumber(Long phoneNumber, Integer userId) {
		
		return repo.updatePhoneNumber(phoneNumber, userId);
	}


	@Override
	public int updatePassword(String password, Integer userId) {
		
		return repo.updatePassword(password, userId);
	}





//	@Override
//	public void deleteByName(String name) {
//		
//		repo.deleteByName(name);
//		
//	}
//	@Override
//	public Users updatePhoneNumber(Long phoneNumber, Integer userId) {
//		
//		return repo.updatePhoneNumber(phoneNumber, userId);
//	}
//
//	@Override
//	public Users updatePassword(String password, Integer userId) {
//		
//		return repo.updatePassword(password, userId);
//	}



}

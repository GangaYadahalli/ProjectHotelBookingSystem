package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelbookingsystem.entities.Rooms;
import com.hexaware.hotelbookingsystem.repository.RoomsRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class RoomsServiceImp implements IRoomsService {
	@Autowired 
	RoomsRepository repo;

	@Override
	public Rooms addRooms(Rooms room) {
		
		return repo.save(room);
	}

	@Override
	public Rooms updateRooms(Rooms room) {
		
		
		return repo.save(room);
	}

	@Override
	public Rooms getRoomById(Integer roomId) {
		
		return repo.findById(roomId).orElse(null);
	}

	@Override
	public void deleteRoomsById(Integer roomId) {
		
		repo.deleteById(roomId);
		
	}

	@Override
	public List<Rooms> getAllRooms() {
		
		return  repo.findAll();
	}

	@Override
	public Rooms updatepricePerNight(Integer pricePerNight, Integer roomId) {
		
		return repo.updatepricePerNight(pricePerNight, roomId);
	}

	@Override
	public Rooms updateCapacity(Integer capacity, Integer roomId) {
		
		return repo.updateCapacity(capacity, roomId);
	}

	


}

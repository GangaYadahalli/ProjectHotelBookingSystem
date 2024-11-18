package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import com.hexaware.hotelbookingsystem.entities.Rooms;
import com.hexaware.hotelbookingsystem.entities.Users;

public interface IRoomsService {
	
	 public Rooms addRooms(Rooms room);
		
		public Rooms updateRooms(Rooms room);
		
		public Rooms getRoomById(Integer roomId);
		
		public void deleteRoomsById(Integer roomId);
		
		public List<Rooms> getAllRooms();
		
		public Rooms updatepricePerNight(Integer pricePerNight, Integer roomId);
		
		public Rooms updateCapacity(Integer capacity, Integer roomId);

}

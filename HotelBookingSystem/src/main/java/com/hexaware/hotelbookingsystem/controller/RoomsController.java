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

import com.hexaware.hotelbookingsystem.entities.Rooms;
import com.hexaware.hotelbookingsystem.exception.RoomNotFoundException;
import com.hexaware.hotelbookingsystem.service.IRoomsService;

@RestController
@RequestMapping("/api/rooms")
public class RoomsController {
	@Autowired
	IRoomsService service;
	
	@PostMapping("/insert")
	  public  Rooms  insert(@RequestBody Rooms room) {
		
		return  service.addRooms(room);
	  }
	@PutMapping("/update")
	  public Rooms   update(@RequestBody Rooms room) {
		
		  return service.updateRooms(room);
		  
	  }
	@DeleteMapping("/delete/{roomId}")
	  public String   delete(@PathVariable  Integer roomId) {
		  
		service.deleteRoomsById(roomId);
		return "Record deleted for roomId" +roomId;
	  }
	  
	  @GetMapping("/getbyid/{roomId}")
	  public  Rooms  getById(@PathVariable Integer roomId) {
		  Rooms room=null;
		  room= service.getRoomById(roomId);
			    if (room == null) {
			        throw new RoomNotFoundException();
			    }
			    return room;
		  
	  }
	  
	  @GetMapping("/getall")
	  public List<Rooms>  getAll(){
		  
		  return service.getAllRooms();
		  
	  }
	  
		@PutMapping("/updatePricePerNight/{pricePerNight}/{roomId}")
		  public Rooms   updatePricePerNight(@PathVariable Integer pricePerNight,@PathVariable Integer roomId) {
			
			  return service.updatepricePerNight(pricePerNight, roomId);
			  
		  }
		@PutMapping("/updateCapacity/{capacity}/{hotelId}")
		  public Rooms  updateCapacity(@PathVariable Integer capacity ,@PathVariable Integer roomId) {
			
			  return service.updateCapacity(capacity, roomId);
			  
		  }

}

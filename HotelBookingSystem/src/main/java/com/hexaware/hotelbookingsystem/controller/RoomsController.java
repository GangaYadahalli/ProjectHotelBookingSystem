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

import com.hexaware.hotelbookingsystem.dto.RoomsDto;
import com.hexaware.hotelbookingsystem.entities.Rooms;
import com.hexaware.hotelbookingsystem.exception.RoomNotFoundException;
import com.hexaware.hotelbookingsystem.service.IRoomsService;

@RestController
@RequestMapping("/api/rooms")
public class RoomsController {
	@Autowired
	IRoomsService service;
	
	@PostMapping("/insert")
	  public  Rooms  insert(@RequestBody RoomsDto roomDto) {
		
		return  service.addRooms(roomDto);
	  }
	@PutMapping("/update")
	  public Rooms   update(@RequestBody RoomsDto roomDto) {
		
		  return service.updateRooms(roomDto);
		  
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
	  
		@PutMapping("/updatePricePerNight/{price}/{id}")
		  public int  updatePricePerNight(@PathVariable Integer price ,@PathVariable Integer id) {
			
			  return service.updatepricePerNight(price, id);
			  
		  }
		@PutMapping("/updateCapacity/{capacity}/{id}")
		  public int  updateCapacity(@PathVariable Integer capacity ,@PathVariable Integer id) {
			
			  return service.updateCapacity(capacity, id);
			  
		  }

}

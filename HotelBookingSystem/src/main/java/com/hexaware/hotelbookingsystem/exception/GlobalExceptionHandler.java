package com.hexaware.hotelbookingsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String> handleUserNotFoundException() {
	    return new ResponseEntity<>("Invalid input format please enter valid userId  ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(HotelNotFoundException.class)
	public ResponseEntity<String> handleHotelNotFoundException() {
	    return new ResponseEntity<>("Invalid input format please enter valid hotelId  ",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(RoomNotFoundException.class)
	public ResponseEntity<String> handleRoomNotFoundException() {
	    return new ResponseEntity<>("Invalid input format please enter valid roomId  ",HttpStatus.BAD_REQUEST);
	}
	


}

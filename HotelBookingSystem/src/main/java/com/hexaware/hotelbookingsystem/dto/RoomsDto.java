package com.hexaware.hotelbookingsystem.dto;

public class RoomsDto {

	private Integer roomId;
	private Integer roomNumber;
	private RoomType roomType;
	private Double pricePerNight;
	private AvailabilityStatus availabilityStatus;
	private Integer capacity;
	private String description;

	public enum RoomType {
		SINGLE, DOUBLE, SUITE
	}

	public enum AvailabilityStatus {
		AVAILABLE, BOOKED
	}

	public RoomsDto() {
		super();
	}

	public RoomsDto(Integer roomId, Integer roomNumber, RoomType roomType, Double pricePerNight,
			AvailabilityStatus availabilityStatus, Integer capacity, String description) {
		super();
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.availabilityStatus = availabilityStatus;
		this.capacity = capacity;
		this.description = description;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public Double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(Double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public AvailabilityStatus getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(AvailabilityStatus availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

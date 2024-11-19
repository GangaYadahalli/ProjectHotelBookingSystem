package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import com.hexaware.hotelbookingsystem.entities.Payments;

public interface IPaymentsService {

	// Processes a new payment
    Payments processPayment(Payments payment);

    // Retrieves a payment by its ID
    Payments getPaymentById(Integer paymentId);

    // Retrieves all payments made by a specific user
    List<Payments> getPaymentsByUserId(Integer userId);

    // Retrieves all payments for a specific booking
    List<Payments> getPaymentsByBookingId(Integer bookingId);

    // Updates the status of a payment
    Payments updatePaymentStatus(Payments payment);
  
}
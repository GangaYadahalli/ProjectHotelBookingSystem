package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import com.hexaware.hotelbookingsystem.entities.Payments;

public interface IPaymentsService {

	
    Payments processPayment(Payments payment);

   
    Payments getPaymentById(Integer paymentId);

    
    List<Payments> getPaymentsByUserId(Integer userId);


    List<Payments> getPaymentsByBookingId(Integer bookingId);


    Payments updatePaymentStatus(Payments payment);
  
}
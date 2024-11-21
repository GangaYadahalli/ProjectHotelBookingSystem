/*
 *Controller  for payments
 *Author : Prerna
 *Date: 2024-11-16
 * */
package com.hexaware.hotelbookingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hexaware.hotelbookingsystem.entities.Payments;
import com.hexaware.hotelbookingsystem.service.IPaymentsService;


@RestController
@RequestMapping("/payments")
public class PaymentsController {

    @Autowired
    private IPaymentsService paymentsService;

    // 1. Process a new payment
    @PostMapping
    public ResponseEntity<Payments> processPayment(@RequestBody Payments payment) {
        Payments processedPayment = paymentsService.processPayment(payment);
        return new ResponseEntity<>(processedPayment, HttpStatus.CREATED);
    }

    // 2. Get payment by ID
    @GetMapping("/{paymentId}")
    public ResponseEntity<Payments> getPaymentById(@PathVariable Integer paymentId) {
        Payments payment = paymentsService.getPaymentById(paymentId);
        if (payment != null) {
            return new ResponseEntity<>(payment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 3. Get all payments by user ID
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Payments>> getPaymentsByUserId(@PathVariable Integer userId) {
        List<Payments> payments = paymentsService.getPaymentsByUserId(userId);
        if (payments != null && !payments.isEmpty()) {
            return new ResponseEntity<>(payments, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 4. Get all payments for a specific booking
    @GetMapping("/booking/{bookingId}")
    public ResponseEntity<List<Payments>> getPaymentsByBookingId(@PathVariable Integer bookingId) {
        List<Payments> payments = paymentsService.getPaymentsByBookingId(bookingId);
        if (payments != null && !payments.isEmpty()) {
            return new ResponseEntity<>(payments, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 5. Update payment status
    @PutMapping("/{paymentId}")
    public ResponseEntity<Payments> updatePaymentStatus(@PathVariable Integer paymentId, @RequestBody Payments updatedPayment) {
        Payments existingPayment = paymentsService.getPaymentById(paymentId);
        if (existingPayment != null) {
            updatedPayment.setPaymentId(paymentId); // Ensure the ID remains unchanged
            Payments updated = paymentsService.updatePaymentStatus(updatedPayment);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
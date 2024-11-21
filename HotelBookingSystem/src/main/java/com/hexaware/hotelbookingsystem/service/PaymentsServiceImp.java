//package com.hexaware.hotelbookingsystem.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.hexaware.hotelbookingsystem.entities.Payments;
//import com.hexaware.hotelbookingsystem.repository.PaymentsRepository;
//
//public class PaymentsServiceImp implements IPaymentsService {
//
//	@Autowired
//    private PaymentsRepository repo;
//	
//	// 1. Process a new payment
//    @Override
//    public Payments processPayment(Payments payment) {
//        return repo.save(payment); // Save payment in DB
//    }
//
//    // 2. Get payment by ID
//    @Override
//    public Payments getPaymentById(Integer paymentId) {
//        return repo.findById(paymentId).orElse(null); // Retrieve payment or return null
//    }
//
//    // 3. Get all payments by user ID
//    @Override
//    public List<Payments> getPaymentsByUserId(Integer userId) {
//        return repo.findByUserId(userId);
//    }
//
//    // 4. Get all payments by booking ID
//    @Override
//    public List<Payments> getPaymentsByBookingId(Integer bookingId) {
//        return repo.findByBookingId(bookingId);
//    }
//
//    // 5. Update payment status
//    @Override
//    public Payments updatePaymentStatus(Payments payment) {
//        Optional<Payments> existingPayment = repo.findById(payment.getPaymentId());
//        if (existingPayment.isPresent()) {
//            Payments updatedPayment = existingPayment.get();
//            updatedPayment.setPaymentStatus(payment.getPaymentStatus());
//            return repo.save(updatedPayment);
//        }
//        return null; // Return null if payment not found
//    }
//
//}
//package com.hexaware.hotelbookingsystem.service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import com.hexaware.hotelbookingsystem.entities.Payments;
//import com.hexaware.hotelbookingsystem.entities.Payments.PaymentStatus;
//import com.hexaware.hotelbookingsystem.repository.PaymentsRepository;
//
//class PaymentsServiceImpTest {
//	
//	@Mock
//    private PaymentsRepository repo;
//
//    @InjectMocks
//    private PaymentsServiceImp service;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this); // Initialize mocks
//    }
//
//    @Test
//    @Disabled
//    void testProcessPayment() {
//        Payments payment = new Payments();
//        payment.setPaymentId(1);
//        payment.setPaymentAmount(1000.00);
//        payment.setPaymentStatus(PaymentStatus.PENDING);
//        payment.setPaymentDate(LocalDate.now());
//
//        when(repo.save(payment)).thenReturn(payment);
//
//        Payments result = service.processPayment(payment);
//
//        assertNotNull(result);
//        assertEquals(PaymentStatus.PENDING, result.getPaymentStatus());
//        verify(repo, times(1)).save(payment);
//    }
//
//    @Test
//    @Disabled
//    void testGetPaymentById() {
//        Payments payment = new Payments();
//        payment.setPaymentId(1);
//
//        when(repo.findById(1)).thenReturn(Optional.of(payment));
//
//        Payments result = service.getPaymentById(1);
//
//        assertNotNull(result);
//        assertEquals(1, result.getPaymentId());
//        verify(repo, times(1)).findById(1);
//    }
//
//    @Test
//    @Disabled
//    void testGetPaymentsByUserId() {
//        Payments payment1 = new Payments();
//        Payments payment2 = new Payments();
//        payment1.setPaymentId(1);
//        payment2.setPaymentId(2);
//
//        when(repo.findByUser_UserId(1)).thenReturn(Arrays.asList(payment1, payment2));
//
//        List<Payments> result = service.getPaymentsByUserId(1);
//
//        assertNotNull(result);
//        assertEquals(2, result.size());
//        verify(repo, times(1)).findByUser_UserId(1);
//    }
//
//    @Test
//    @Disabled
//    void testUpdatePaymentStatus() {
//        Payments payment = new Payments();
//        payment.setPaymentId(1);
//        payment.setPaymentStatus(PaymentStatus.PENDING);
//
//        when(repo.findById(1)).thenReturn(Optional.of(payment));
//        when(repo.save(any(Payments.class))).thenReturn(payment);
//
//        payment.setPaymentStatus(PaymentStatus.SUCCESS);
//
//        Payments result = service.updatePaymentStatus(payment);
//
//        assertNotNull(result);
//        assertEquals(PaymentStatus.SUCCESS, result.getPaymentStatus());
//        verify(repo, times(1)).findById(1);
//        verify(repo, times(1)).save(payment);
//        
//    }
//}
package com.hexaware.hotelbookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.hotelbookingsystem.entities.Payments;

public interface PaymentsRepository extends JpaRepository<Payments, Integer> {
	List<Payments> findByUserId(Integer userId);
}

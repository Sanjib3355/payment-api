package com.sanjib.payment.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjib.payment.api.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}

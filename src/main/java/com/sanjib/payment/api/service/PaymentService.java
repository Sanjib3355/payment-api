package com.sanjib.payment.api.service;

public interface PaymentService {
	
	String processPayment(double amount);
	
	String getPaymentType(Long id);

}

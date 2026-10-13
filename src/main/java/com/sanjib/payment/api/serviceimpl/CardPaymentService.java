package com.sanjib.payment.api.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjib.payment.api.customexception.PaymentException;
import com.sanjib.payment.api.entity.Payment;
import com.sanjib.payment.api.repository.PaymentRepository;
import com.sanjib.payment.api.service.PaymentService;

@Service("cardpayment")
public class CardPaymentService implements PaymentService {

	@Autowired
	private PaymentRepository repository;

	@Override
	public String processPayment(double amount) {

		if (amount <= 0) {
			throw new RuntimeException("Amount should not be zero or negative");

		}

		Payment payment = new Payment();
		payment.setAmount(amount);
		payment.setPaymentType("Card Payment");
		payment.setStatus("Success");

		repository.save(payment);
		
		return "Card Payment Successful";
	}

	@Override
	public String getPaymentType(Long id) {

		Payment paymentType = repository.findById(id).orElseThrow(() -> new PaymentException("Payment type not found with id : " + id));

		return paymentType.getPaymentType();
	}
}
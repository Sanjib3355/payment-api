package com.sanjib.payment.api.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjib.payment.api.entity.Payment;
import com.sanjib.payment.api.repository.PaymentRepository;
import com.sanjib.payment.api.service.PaymentService;

@Service("upipayment")
public class UPIPaymentService implements PaymentService {

		@Autowired
		private PaymentRepository repository;

		@Override
		public String processPayment(double amount) {

			if (amount <= 0) {
				throw new RuntimeException("Amount should not be zero or negative");

			}

			Payment payment = new Payment();
			payment.setAmount(amount);
			payment.setPaymentType("UPI Payment");
			payment.setStatus("Success");

			repository.save(payment);

			return "UPI Payment Successful";
		}

		@Override
		public String getPaymentType(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
	}

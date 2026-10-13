package com.sanjib.payment.api.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanjib.payment.api.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	private final PaymentService paymentService;

	public PaymentController(@Qualifier("upipayment") PaymentService paymentService) {

		this.paymentService = paymentService;

	}

	@PostMapping
	public ResponseEntity<String> pay(@RequestParam double amount) {

		String response = paymentService.processPayment(amount);

		return ResponseEntity.ok(response);

	}
}

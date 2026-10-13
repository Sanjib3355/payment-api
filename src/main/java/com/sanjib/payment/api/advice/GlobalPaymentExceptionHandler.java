package com.sanjib.payment.api.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sanjib.payment.api.customexception.PaymentException;

//@ResponseStatus(HttpStatus.BAD_REQUEST)
@RestControllerAdvice
public class GlobalPaymentExceptionHandler {

	@ExceptionHandler(PaymentException.class)
	public ResponseEntity<Object> handlePymentException(PaymentException exc) {

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exc.getMessage());

	}

}

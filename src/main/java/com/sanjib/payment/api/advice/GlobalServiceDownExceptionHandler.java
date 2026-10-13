package com.sanjib.payment.api.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sanjib.payment.api.customexception.ServiceDownException;

@RestControllerAdvice
public class GlobalServiceDownExceptionHandler {

	@ExceptionHandler(ServiceDownException.class)
	public ResponseEntity<?> handleServiceDownException(ServiceDownException ex) {

		ResponseEntity<Object> response = ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(ex.getMessage());

		return response;
	}

}

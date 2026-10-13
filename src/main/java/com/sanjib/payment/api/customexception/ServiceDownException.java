package com.sanjib.payment.api.customexception;

public class ServiceDownException extends Exception {

	private static final long serialVersionUID = 1L;

	public ServiceDownException(String message) {
		
		super(message);
	}

}

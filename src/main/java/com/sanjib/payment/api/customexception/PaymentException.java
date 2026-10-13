package com.sanjib.payment.api.customexception;

//@SuppressWarnings("serial")
public class PaymentException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	//private static final long serialVersionUID = 8760026960073159365L;

	public PaymentException(String message) {
		
		super(message);
	}

}

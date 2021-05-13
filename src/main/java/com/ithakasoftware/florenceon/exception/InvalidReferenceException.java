package com.ithakasoftware.florenceon.exception;

public class InvalidReferenceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidReferenceException(String errorMessage) {
		super(errorMessage);
	}

}
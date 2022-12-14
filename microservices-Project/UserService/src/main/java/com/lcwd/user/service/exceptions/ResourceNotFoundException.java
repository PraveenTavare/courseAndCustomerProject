package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1026971009837871606L;

	public ResourceNotFoundException() {
		super("Resource not found on server!!");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}

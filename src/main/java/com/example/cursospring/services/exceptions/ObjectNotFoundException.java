package com.example.cursospring.services.exceptions;

import java.io.Serializable;

public class ObjectNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 1L;
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg,cause);
	}

}

package com.hexaware.app.Exceptions;

public class IDNotFoundException extends RuntimeException {

    public IDNotFoundException(String message) {
        super(message);
    }

    public IDNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

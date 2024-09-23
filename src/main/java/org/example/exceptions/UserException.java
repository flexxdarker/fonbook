package org.example.exceptions;


import java.io.IOException;

public class UserException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public UserException() {
        super();
    }
    public UserException(String customMessage) {
        super(customMessage);
    }
    public UserException(String couldNotInitializeStorage, IOException e) {
    }
}

package org.example.exceptions;


public class CategoryException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public CategoryException() {
        super();
    }

    public CategoryException(String customMessage) {
        super(customMessage);
    }
}

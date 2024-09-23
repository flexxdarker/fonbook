package org.example.exceptions;


public class ProductException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public ProductException() {
        super();
    }
    public ProductException(String customMessage) {
        super(customMessage);
    }
}

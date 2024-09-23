package org.example.exceptions;


import java.io.IOException;

public class StorageException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public StorageException() {
        super();
    }

    public StorageException(String customMessage) {
        super(customMessage);
    }

    public StorageException(String couldNotInitializeStorage, IOException e) {
    }
}

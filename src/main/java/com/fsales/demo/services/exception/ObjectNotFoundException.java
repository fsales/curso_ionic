package com.fsales.demo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 8141231385979815601L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

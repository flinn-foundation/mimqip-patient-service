package org.flinnfoundation.exception;

public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException() {
        super();
    }

    public PatientNotFoundException(String message) {
        super(message);
    }

    public PatientNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PatientNotFoundException(Throwable cause) {
        super(cause);
    }

    protected PatientNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

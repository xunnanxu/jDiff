package org.xcorpion.jdiff.exception;

public class CloneException extends RuntimeException {

    public CloneException() {
        super();
    }

    public CloneException(String message) {
        super(message);
    }

    public CloneException(String message, Throwable cause) {
        super(message, cause);
    }

    public CloneException(Throwable cause) {
        super(cause);
    }
}

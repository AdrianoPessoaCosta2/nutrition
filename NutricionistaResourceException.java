package com.adriano.nutrition.exception;

public class NutricionistaResourceException extends Exception{
    public NutricionistaResourceException() {
    }

    public NutricionistaResourceException(String message) {
        super(message);
    }

    public NutricionistaResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NutricionistaResourceException(Throwable cause) {
        super(cause);
    }

    public NutricionistaResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

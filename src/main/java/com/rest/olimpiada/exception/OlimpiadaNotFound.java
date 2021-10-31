package com.rest.olimpiada.exception;

public class OlimpiadaNotFound extends RuntimeException {
    public OlimpiadaNotFound() {
        super("Team not found.");
    }

    public OlimpiadaNotFound(String message) {
        super(message);
    }
}

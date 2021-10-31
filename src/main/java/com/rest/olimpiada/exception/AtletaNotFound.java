package com.rest.olimpiada.exception;

public class AtletaNotFound extends RuntimeException {
    public AtletaNotFound() {
        super("Atleta nao encontrado.");
    }

    public AtletaNotFound(String message) {
        super(message);
    }
}
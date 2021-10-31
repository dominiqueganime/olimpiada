package com.rest.olimpiada.exception;

public class MedalhaNotFound extends RuntimeException {
    public MedalhaNotFound() {
        super("Medalha nao encontrada.");
    }

    public MedalhaNotFound(String message) {
        super(message);
    }

}

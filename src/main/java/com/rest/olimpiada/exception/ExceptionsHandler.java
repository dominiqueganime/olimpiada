package com.rest.olimpiada.exception;

import com.rest.olimpiada.controller.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice

//Classes of Exceptions for Skill and Summoners
public class ExceptionsHandler {
    @ExceptionHandler({AtletaNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public HttpResponse handleGenericException(AtletaNotFound exception) {
        return new HttpResponse(
                404,
                exception.getMessage(),
                LocalDateTime.now()
        );
    }
}

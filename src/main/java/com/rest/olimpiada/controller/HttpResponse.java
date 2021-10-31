package com.rest.olimpiada.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class HttpResponse {
    private int status;
    private Integer Error;
    private LocalDateTime timestamp;
}

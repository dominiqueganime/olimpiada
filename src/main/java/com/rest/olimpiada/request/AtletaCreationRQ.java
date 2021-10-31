package com.rest.olimpiada.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AtletaCreationRQ {
    @NotBlank
    private String nome;

    private String pais;

}


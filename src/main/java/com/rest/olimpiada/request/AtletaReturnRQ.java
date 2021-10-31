package com.rest.olimpiada.request;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AtletaReturnRQ {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nome;

    private String pais;

}

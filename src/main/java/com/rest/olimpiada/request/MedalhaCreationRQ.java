package com.rest.olimpiada.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedalhaCreationRQ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String pais;

    private String atleta;
}
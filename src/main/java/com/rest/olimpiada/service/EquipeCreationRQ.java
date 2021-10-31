package com.rest.olimpiada.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EquipeCreationRQ {

    private String pais;

}

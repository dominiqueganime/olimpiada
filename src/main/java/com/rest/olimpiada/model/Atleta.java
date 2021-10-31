package com.rest.olimpiada.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "atleta")
public class Atleta {

    @Id
    private String nome;

    private String pais;

    @OneToOne(mappedBy = "atletaMedalha")
    private Set<Medalha> medalhas = new HashSet<>();

}

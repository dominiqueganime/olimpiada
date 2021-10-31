package com.rest.olimpiada.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "equipe")
public class Olimpiada {

    @Id
    private String pais;

    private String ultimojogo;

    @ManyToMany(mappedBy = "equipe")
    private Set<Equipe> equipes = new HashSet<>();

}

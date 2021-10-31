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
public class Equipe {

    @Id
    private String pais;

    private String ultimojogo;

    @OneToMany(mappedBy = "atleta")
    private Set<Atleta> atletas = new HashSet<>();

}

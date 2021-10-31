package com.rest.olimpiada.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "medalha")
public class Medalha {

    @Id
    private String quantidade;

    private String atleta;

    @OneToOne
    @JoinTable(
            name = "atleta_medalha",
            joinColumns = @JoinColumn(name = "medalha_atleta"),
            inverseJoinColumns = @JoinColumn(name = "atleta_nome")
    )
    private Set<Atleta> atletaMedalha = new HashSet<>();
}

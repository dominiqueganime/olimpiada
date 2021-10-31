package com.rest.olimpiada.repository;

import com.rest.olimpiada.model.Medalha;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Primary
@Repository
public interface MedalhaRepository extends JpaRepository<Medalha, String> {
    Medalha findByPais(String pais);
    Medalha findByAtleta(String atleta);

    void deleteByAtleta(String atleta);
}

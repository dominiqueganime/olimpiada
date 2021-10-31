package com.rest.olimpiada.repository;

import com.rest.olimpiada.model.Atleta;
import com.rest.olimpiada.model.Equipe;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Primary
@Repository
public interface EquipeRepository extends JpaRepository<Equipe, String> {

    Optional<Equipe> findByPais(String pais);

    void deleteByPais(String pais);

    void deleteByNome(String nome);

}

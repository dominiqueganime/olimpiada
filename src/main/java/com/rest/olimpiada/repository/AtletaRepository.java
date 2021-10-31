package com.rest.olimpiada.repository;

import com.rest.olimpiada.model.Atleta;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Primary
@Repository
public interface AtletaRepository extends JpaRepository<Atleta, String> {

    Optional<Atleta> findByNome(String nome);

    void deleteByNome(String nome);
}

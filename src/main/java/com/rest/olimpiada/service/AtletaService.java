package com.rest.olimpiada.service;

import com.rest.olimpiada.exception.AtletaNotFound;
import com.rest.olimpiada.model.Atleta;
import com.rest.olimpiada.repository.AtletaRepository;
import com.rest.olimpiada.request.AtletaCreationRQ;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtletaService {
    AtletaRepository atletaRepository;

    public AtletaService(AtletaRepository atletaRepository) {
        this.atletaRepository = atletaRepository;
    }

    //Find all members
    public List<Atleta> findAll() {
        return atletaRepository.findAll();
    }

    //Find by Nome
    public Atleta getAtletaByNome(String nome) {
        return atletaRepository.findByNome(nome).orElseThrow(AtletaNotFound::new);
    }


    //Criar um nome atleta
    public List<Atleta> createAtletas(List<AtletaCreationRQ> atletaCreationRQList) {
        List<Atleta> newAtletaList = new ArrayList<>();
        Atleta newAtleta;
        for (AtletaCreationRQ atletaCreationRQ : atletaCreationRQList) {
            newAtleta = Atleta.builder().nome(atletaCreationRQ.getNome()).build();
            atletaRepository.save(newAtleta);
            newAtletaList.add(newAtleta);
        }
        return newAtletaList;
    }

    //Update do atleta
    public Atleta updateAtleta(String nome, String pais) {
        Atleta atletaToUpdate = this.getAtletasByNome(nome);
        atletaToUpdate.setNome(nome);
        atletaRepository.save(atletaToUpdate);
        return atletaToUpdate;
    }

    private Atleta getAtletasByNome(String nome) {
        return atletaRepository.findByNome(nome).get();

    }

    //Deletar por nome
    public void deleteByName(String nome) {
        this.getAtletasByNome(nome);
        atletaRepository.deleteByNome(nome);
    }

    public void deleteByNome(String nome) {
    }

    public Atleta UpdateAtleta(String nome, String updateAtletaNomeRQNome) {
        return null;
    }


}

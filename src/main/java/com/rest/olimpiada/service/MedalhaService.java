package com.rest.olimpiada.service;

import com.rest.olimpiada.model.Medalha;
import com.rest.olimpiada.repository.MedalhaRepository;
import com.rest.olimpiada.request.MedalhaCreationRQ;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedalhaService {

    MedalhaRepository medalhaRepository;

    public MedalhaService(MedalhaRepository medalhaRepository) {
        this.medalhaRepository = medalhaRepository;
    }

    //Find all medalha
    public List<Medalha> findAll() {
        return medalhaRepository.findAll();
    }

    //Find by pais
    public Medalha getMedalhasByPais(String pais) {
        var byPais = medalhaRepository.findByPais(pais);
        return byPais;

    }

    public Medalha getMedalhasByAtleta(String atleta) {
        var byAtleta = medalhaRepository.findByPais(atleta);
        return byAtleta;
    }

    //Create nova Medalha (List)
    public List<Medalha> createMedalhas(List<MedalhaCreationRQ> medalhaCreationRQList) {
        List<Medalha> newMedalhaList = new ArrayList<>();
        Medalha newMedalha;
        for (MedalhaCreationRQ medalhaCreationRQ : medalhaCreationRQList) {
            newMedalha = Medalha.builder().atleta(medalhaCreationRQ.getAtleta()).build();
            medalhaRepository.save(newMedalha);
            newMedalhaList.add(newMedalha);
        }
        return newMedalhaList;
    }

    //Update medalhas by atleta
    public Medalha updateMedalha(String atleta) {
        Medalha medalhaToUpdate = this.getMedalhaByPais(atleta);
        medalhaToUpdate.setAtleta(atleta);
        medalhaRepository.save(medalhaToUpdate);
        return medalhaToUpdate;
    }

    private Medalha getMedalhaByPais(String pais) {
        return null;
    }
    
    //Delete by Atleta
    public void deleteById(String atleta) {
        this.getMedalhasByAtleta(atleta);
        medalhaRepository.deleteByAtleta(atleta);
    }


}

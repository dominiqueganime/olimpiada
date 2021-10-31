package com.rest.olimpiada.service;


import com.rest.olimpiada.exception.EquipeNotFound;
import com.rest.olimpiada.model.Equipe;
import com.rest.olimpiada.repository.EquipeRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class EquipeService {


    private final com.rest.olimpiada.repository.EquipeRepository EquipeRepository;
    EquipeRepository equipeRepository;

    public EquipeService(EquipeRepository equipeRepository) { this.EquipeRepository = equipeRepository;
    }

    //Find all
    public List<Equipe> findAll() {
        return equipeRepository.findAll();
    }

    //Find por Pais
    public Equipe getEquipeByPais(String pais) {
        return equipeRepository.findByPais(pais).orElseThrow(EquipeNotFound::new);
    }


    //Create nova Equipe (List)
    public List<Equipe> createEquipe(List<EquipeCreationRQ> EquipeCreationRQList) {
        List<Equipe> newEquipeList = new ArrayList<>();
        Equipe newEquipe;
        for (EquipeCreationRQ equipeCreationRQ : EquipeCreationRQList) {
            newEquipe = Equipe.builder().pais(equipeCreationRQ.getPais()).build();
            equipeRepository.save(newEquipe);
            newEquipeList.add(newEquipe);
        }
        return newEquipeList;
    }

    //Update Equipe por nome
    public Equipe updateEquipe(String pais) {
        Equipe equipeToUpdate = this.getEquipeBypais(pais);
        equipeToUpdate.setPais(pais);
        equipeRepository.save(equipeToUpdate);
        return equipeToUpdate;
    }

    public Equipe getEquipeBypais(String pais) {

        return null;
    }


    //Delete by Nome
    public void deleteByNome(String nome) {
        this.getEquipeByNome(nome);
        equipeRepository.deleteByNome(nome);

    }

    private void getEquipeByNome(String nome) {
    }

    public void deleteBypais(String pais) {
    }
}

package com.rest.olimpiada.controller;

import com.rest.olimpiada.model.Equipe;
import com.rest.olimpiada.request.UpdateEquipePaisRQ;
import com.rest.olimpiada.service.EquipeCreationRQ;
import com.rest.olimpiada.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public class EquipeController {

    @Autowired
    EquipeService equipeService;

    //Get all teams
    @GetMapping("/Equipe")
    public List<Equipe> getEquipe() {
        return equipeService.findAll();
    }

    //Get team by pais
    @GetMapping("/Equipe/{pais}")
    public Equipe getEquipeById(@PathVariable String pais) {
        return equipeService.getEquipeBypais(pais);
    }

    //Create teams
    @PostMapping(value = "/Equipe")
    public List<Equipe> createEquipe(@RequestBody @Valid List<EquipeCreationRQ> createEquipeRQ) {
        return equipeService.createEquipe(createEquipeRQ);
    }

    //Update Equipe
    @PutMapping(value = "/Equipe-update/{pais}")
    public Equipe updateEquipePais (@RequestBody UpdateEquipePaisRQ updateEquipePaisRQ) {
        Equipe equipe = equipeService.updateEquipe(updateEquipePaisRQ.getPais());
        return equipe;
    }

    //Delete Equipe
    @DeleteMapping(value = "/Equipe-delete/{pais}")
    public void deleteByPais(@PathVariable(value = "pais") String pais) {
        equipeService.deleteBypais(pais);
    }

}

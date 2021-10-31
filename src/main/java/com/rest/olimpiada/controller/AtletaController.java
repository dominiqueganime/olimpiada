package com.rest.olimpiada.controller;

import com.rest.olimpiada.model.Atleta;
import com.rest.olimpiada.request.AtletaCreationRQ;
import com.rest.olimpiada.request.UpdateAtletaNomeRQ;
import com.rest.olimpiada.service.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class AtletaController {

    @Autowired
    AtletaService atletaService;

    //Get all Atletas
    @GetMapping("/Atletas")
    public List<Atleta> getAtletas() {
        return atletaService.findAll();
    }

    //Get Atletas pelo nome
    @GetMapping("/Atletas/{nome}")
    public Atleta getAtletaByNome(@PathVariable String nome) {
        return atletaService.getAtletaByNome(nome);
    }


    //Create novo Atleta
    @PostMapping(value = "/Atletas")
    public List<Atleta> createAtletas(@RequestBody @Valid List<AtletaCreationRQ> createAtletaRQ) {
        return atletaService.createAtletas(createAtletaRQ);
    }

    //Update infomrcaoes do Atleta
    @PutMapping(value = "/Atleta-update/{nome}")
    public Atleta updateAtletaNome(@PathVariable(value = "nome") String nome, @RequestBody UpdateAtletaNomeRQ updateAtletaNomeRQ) {
        return atletaService.UpdateAtleta(nome, updateAtletaNomeRQ.getNome());
    }

    //Delete Atleta
    @DeleteMapping(value = "/Atleta-delete/{nome}")
    public void deleteByNome(@PathVariable(value = "nome") String nome) {
        atletaService.deleteByNome(nome);
    }

}

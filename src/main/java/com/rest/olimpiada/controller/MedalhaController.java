package com.rest.olimpiada.controller;

import com.rest.olimpiada.model.Atleta;
import com.rest.olimpiada.model.Medalha;
import com.rest.olimpiada.request.MedalhaCreationRQ;
import com.rest.olimpiada.request.UpdateMedalhaAtletaRQ;
import com.rest.olimpiada.service.MedalhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class MedalhaController {

    @Autowired
    MedalhaService medalhaService;

    //Get all Medalhas
    @GetMapping("/Medalhas")
    public List<Medalha> getMedalhas() {
        return medalhaService.findAll();
    }

    //Get Medalha pelo atleta
    @GetMapping("/Medalhas/{atleta}")
    public Medalha getMedalhasByAtleta(@PathVariable String atleta) {
        return medalhaService.getMedalhasByAtleta(atleta);
    }

    //Create nova medalha
    @PostMapping(value = "/Medalhas")
    public List<Medalha> createMedalhas(@RequestBody @Valid List<MedalhaCreationRQ> medalhaCreationRQS) {
        return medalhaService.createMedalhas(medalhaCreationRQS);
    }

    //Update Medalhas
    @PutMapping(value = "/Medalha-update/{atleta}")
    public Medalha updateMedalhaAtleta(@RequestBody UpdateMedalhaAtletaRQ updateMedalhaAtletaRQ) {
        return medalhaService.updateMedalha(updateMedalhaAtletaRQ.getAtleta());
    }

    //Delete Medalhas
    @DeleteMapping(path = "/delete-medalha/{pais}")
    public ResponseEntity deleteMedalha(@PathVariable(value = "pais") String medalhaPais) {
       medalhaService.deleteById(medalhaPais);
        return ResponseEntity.created(URI.create("/medalha")).body("medalha removed");
    }

}

package com.example.projet_spring.controller;

import com.example.projet_spring.model.Acteur;
import com.example.projet_spring.model.Film;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Api(value = "ActeurController", tags = {"REST APIs related to Acteur Entity!!!!"})
@RestController
public class ActeurController {

    List<Acteur> actors = new ArrayList<>();
    {
        Acteur act1 = new Acteur("Tommy", "PRENOM1", "y'a pas longtemp");
        Acteur act2 = new Acteur("NOM2", "PRENOM2", "y'a pas longtemp2");
        Acteur act3 = new Acteur("Tommy3", "PRENOM3", "y'a pas longtemp3");

        Film film1 = new Film("film1", "genre1", "Tommy", "2000");
        Film film2 = new Film("film2", "genre2", "Tommy3", "2001");
        act1.addFilmographie(film1);
        act2.addFilmographie(film1);

        act2.addFilmographie(film2);
        act3.addFilmographie(film2);

        actors.add(act1);
        actors.add(act2);
        actors.add(act3);
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully"),
            @ApiResponse(code = 401, message = "Not Authorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found")
    })

    @ApiOperation(value = "Get all actors")
    @RequestMapping(value="/getActors", method= RequestMethod.GET)
    public List<Acteur> getActors() {
        return this.actors;
    }
    @ApiOperation(value = "Get actor by name")
    @RequestMapping(value="/getActor/{nom}", method= RequestMethod.GET)
    public List<Acteur> getActor(@PathVariable(value = "nom") String nom) {
        return this.actors.stream().filter(acteur -> acteur.getNom().equals(nom)).collect(Collectors.toList());
    }
    @ApiOperation(value = "Get actor by year")
    @RequestMapping(value="/getActorsByFilm/{film}", method= RequestMethod.GET)
    public List<Acteur> getActorsForFilm(@PathVariable(value = "film") String film) {
        return this.actors.stream().filter(acteur -> acteur.getFilmographie().stream().anyMatch(film1 -> film1.getTitre().equals(film))).collect(Collectors.toList());
    }
}

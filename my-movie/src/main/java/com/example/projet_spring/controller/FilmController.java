package com.example.projet_spring.controller;

import com.example.projet_spring.model.Acteur;
import com.example.projet_spring.model.Film;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Api(value = "FilmController", tags = {"REST APIs related to Film Entity!!!!"})
@RestController
public class FilmController {
    List<Film> film = new ArrayList<>();
    {
//        Acteur act1 = new Acteur("NOM1", "PRENOM1", "y'a pas longtemp");
//        Acteur act2 = new Acteur("NOM2", "PRENOM2", "y'a pas longtemp2");
//        Acteur act3 = new Acteur("NOM3", "PRENOM3", "y'a pas longtemp3");

        Film film1 = new Film("film1", "genre1", "Tommy", "2000");
        Film film2 = new Film("film2", "genre2", "Tommy3", "2001");

        film.add(film1);
        film.add(film2);
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully"),
            @ApiResponse(code = 401, message = "Not Authorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found")
    })

    @ApiOperation(value = "Get all films")
    @RequestMapping(value="/getFilms", method= RequestMethod.GET)
    public List<Film> getFilm() {
        return film;
    }

    @ApiOperation(value = "Get film by name")
    @RequestMapping(value="/getFilm/{titre}", method= RequestMethod.GET)
    public List<Film> getFilm(@PathVariable(value = "titre") String titre) {
        return film.stream().filter(film1 -> film1.getTitre().equals(titre)).collect(Collectors.toList());
    }
    @ApiOperation(value = "Get film by year")
    @RequestMapping(value="/getFilmByYear/{annee}", method= RequestMethod.GET)
    public List<Film> getFilmByYear(@PathVariable(value = "annee") String annee) {
        return film.stream().filter(film1 -> film1.getDateSortie().equals(annee)).collect(Collectors.toList());
    }

}

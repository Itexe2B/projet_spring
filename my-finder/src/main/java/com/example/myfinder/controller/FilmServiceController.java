package com.example.myfinder.controller;

import com.example.myfinder.delegate.FilmServiceDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmServiceController {

    @Autowired
    FilmServiceDelegate filmServiceDelegate;

    @RequestMapping(value="/getFilms", method=RequestMethod.GET)
    public String getFilms() {
        return this.filmServiceDelegate.getFilms("");
    }

    @RequestMapping(value="/getFilm/{film}", method=RequestMethod.GET)
    public String getFilms(@PathVariable(value = "film") String film) {
        return this.filmServiceDelegate.getFilm(film);
    }

    @RequestMapping(value="/getFilmByYear/{annee}", method=RequestMethod.GET)
    public String getFilmByYear(@PathVariable(value = "annee") String annee) {
        return this.filmServiceDelegate.getFilmByYear(annee);
    }

}

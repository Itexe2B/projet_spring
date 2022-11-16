package com.example.myfinder.controller;

import com.example.myfinder.delegate.ServiceDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired
    ServiceDelegate ServiceDelegate;

    @RequestMapping(value="/getFilms", method=RequestMethod.GET)
    public String getFilms() {
        return this.ServiceDelegate.getFilms("");
    }

    @RequestMapping(value="/getFilm/{film}", method=RequestMethod.GET)
    public String getFilms(@PathVariable(value = "film") String film) {
        return this.ServiceDelegate.getFilm(film);
    }

    @RequestMapping(value="/getFilmByYear/{annee}", method=RequestMethod.GET)
    public String getFilmByYear(@PathVariable(value = "annee") String annee) {
        return this.ServiceDelegate.getFilmByYear(annee);
    }

    @RequestMapping(value="/getActors", method=RequestMethod.GET)
    public String getActors() {
        return this.ServiceDelegate.getActors("");
    }

    @RequestMapping(value="/getActor/{actor}", method=RequestMethod.GET)
    public String getActor(@PathVariable(value = "actor") String actor) {
        return this.ServiceDelegate.getActor(actor);
    }

    @RequestMapping(value="/getActorByFilm/{film}", method=RequestMethod.GET)
    public String getActorsForFilm(@PathVariable(value = "film") String film) {
        return this.ServiceDelegate.getActorsForFilm(film);
    }

}

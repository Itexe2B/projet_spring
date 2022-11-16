package com.example.myfinder.controller;

import com.example.myfinder.delegate.ServiceDelegate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="ServiceController", description="REST APIs related to ServiceController Entity!!!!")
public class ServiceController {

    @Autowired
    ServiceDelegate ServiceDelegate;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully"),
            @ApiResponse(code = 401, message = "Not Authorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found")
    })

    @RequestMapping(value="/healthMovie", method=RequestMethod.GET)
    @ApiOperation(value = "Get health Movie API", tags = "healthMovie")
    public String getHealth() {
        return this.ServiceDelegate.healthMovie();
    }

    @RequestMapping(value="/getFilms", method=RequestMethod.GET)
    @ApiOperation(value = "Get all films", tags = "getFilms")
    public String getFilms() {
        return this.ServiceDelegate.getFilms("");
    }

    @RequestMapping(value="/getFilm/{film}", method=RequestMethod.GET)
    @ApiOperation(value = "Get film", tags = "getFilm")
    public String getFilm(@PathVariable(value = "film") String film) {
        return this.ServiceDelegate.getFilm(film);
    }

    @RequestMapping(value="/getFilmByYear/{annee}", method=RequestMethod.GET)
    @ApiOperation(value = "Get film by year", tags = "getFilmByYear")
    public String getFilmByYear(@PathVariable(value = "annee") String annee) {
        return this.ServiceDelegate.getFilmByYear(annee);
    }

    @RequestMapping(value="/getActors", method=RequestMethod.GET)
    @ApiOperation(value = "Get all actors", tags = "getActors")
    public String getActors() {
        return this.ServiceDelegate.getActors("");
    }

    @RequestMapping(value="/getActor/{actor}", method=RequestMethod.GET)
    @ApiOperation(value = "Get actor", tags = "getActor")
    public String getActor(@PathVariable(value = "actor") String actor) {
        return this.ServiceDelegate.getActor(actor);
    }

    @RequestMapping(value="/getActorByFilm/{film}", method=RequestMethod.GET)
    @ApiOperation(value = "Get actors for film", tags = "getActorByFilm")
    public String getActorsForFilm(@PathVariable(value = "film") String film) {
        return this.ServiceDelegate.getActorsForFilm(film);
    }

}

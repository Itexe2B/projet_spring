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
    public String getStudents() {
        return this.filmServiceDelegate.getFilms("");
    }

}

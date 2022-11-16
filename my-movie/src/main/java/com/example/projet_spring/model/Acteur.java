package com.example.projet_spring.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Les acteurs", value = "Acteur")
public class Acteur {
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public List<Film> getFilmographie() {
        return filmographie;
    }

    @ApiModelProperty(notes = "Le nom de l'acteur")
    private String nom;
    @ApiModelProperty(notes = "Le prenom de l'acteur")
    private String prenom;
    @ApiModelProperty(notes = "La date de naissance de l'acteur")
    private String dateNaissance;

    public void addFilmographie(Film filmographie) {
        this.filmographie.add(filmographie);
    }
    @ApiModelProperty(notes = "La filmographie de l'acteur")
    private List<Film> filmographie;

    public Acteur(String nom, String prenom, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filmographie = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Acteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", filmographie=" + filmographie.toString() +
                '}';
    }


    //TODO Impossible de serializer l'objet acteur si film est un objet


}

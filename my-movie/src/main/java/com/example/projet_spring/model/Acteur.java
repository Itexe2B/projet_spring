package com.example.projet_spring.model;

import java.util.List;

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

    private String nom;
    private String prenom;
    private String dateNaissance;

    public void addFilmographie(Film filmographie) {
        this.filmographie.add(filmographie);
    }

    private List<Film> filmographie;

    public Acteur(String nom, String prenom, String dateNaissance, List<Film> filmographie) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filmographie = filmographie;
    }


}

package com.example.projet_spring.model;

import java.util.ArrayList;
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

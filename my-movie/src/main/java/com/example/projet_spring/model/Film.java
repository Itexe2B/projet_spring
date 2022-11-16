package com.example.projet_spring.model;

public class Film {

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public Acteur getActeurPrincipal() {
        return acteurPrincipal;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setActeurPrincipal(Acteur acteurPrincipal) {
        this.acteurPrincipal = acteurPrincipal;
    }

    private String titre;
    private String realisateur;
    private Acteur acteurPrincipal;
    private String dateSortie;

    public Film(String titre, String realisateur, Acteur acteurPrincipal, String dateSortie) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurPrincipal = acteurPrincipal;
        this.dateSortie = dateSortie;
    }
}

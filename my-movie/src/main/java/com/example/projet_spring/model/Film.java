package com.example.projet_spring.model;

public class Film {

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public String getActeurPrincipal() {
        return acteurPrincipal;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setActeurPrincipal(String acteurPrincipal) {
        this.acteurPrincipal = acteurPrincipal;
    }

    private String titre;
    private String realisateur;
    private String acteurPrincipal;
    private String dateSortie;

    public Film(String titre, String realisateur, String acteurPrincipal, String dateSortie) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurPrincipal = acteurPrincipal;
        this.dateSortie = dateSortie;
    }
}

package com.example.projet_spring.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Les films", value = "Film")
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
    @ApiModelProperty(notes = "Le titre du film")
    private String titre;
    @ApiModelProperty(notes = "Le realisateur du film")
    private String realisateur;
    @ApiModelProperty(notes = "L'acteur principal du film")
    private String acteurPrincipal;
    @ApiModelProperty(notes = "La date de sortie du film")
    private String dateSortie;

    public Film(String titre, String realisateur, String acteurPrincipal, String dateSortie) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurPrincipal = acteurPrincipal;
        this.dateSortie = dateSortie;
    }
}

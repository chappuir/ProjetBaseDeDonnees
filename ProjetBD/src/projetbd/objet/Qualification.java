/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbd.objet;

/**
 *
 * @author JDufo
 */
public class Qualification {
    private Pilote idPilote;
    private Modele_Avion idModele;
    private int nbHeures;

    public Qualification(Pilote idPilote, Modele_Avion idModele, int nbHeures) {
        this.idPilote = idPilote;
        this.idModele = idModele;
        this.nbHeures = nbHeures;
    }

    public Pilote getIdPilote() {
        return idPilote;
    }

    public void setIdPilote(Pilote idPilote) {
        this.idPilote = idPilote;
    }

    public Modele_Avion getIdModele() {
        return idModele;
    }

    public void setIdModele(Modele_Avion idModele) {
        this.idModele = idModele;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }
    
    
}

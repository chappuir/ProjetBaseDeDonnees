/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author JDufo
 */
public class Qualification {
    private Pilote pilote;
    private Modele_Avion modele;
    private int nbHeures;

    public Qualification(Pilote pilote, Modele_Avion modele, int nbHeures) {
        this.pilote = pilote;
        this.modele = modele;
        this.nbHeures = nbHeures;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Modele_Avion getModele() {
        return modele;
    }

    public void setModele(Modele_Avion modele) {
        this.modele = modele;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    
    
}

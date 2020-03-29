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
public class Avion {
    private int idAvion;
    private int nbHotesses;
    private Modele_Avion idModele;

    public Avion(int idAvion, int nbHotesses, Modele_Avion idModele) {
        this.idAvion = idAvion;
        this.nbHotesses = nbHotesses;
        this.idModele = idModele;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public int getNbHotesses() {
        return nbHotesses;
    }

    public void setNbHotesses(int nbHotesses) {
        this.nbHotesses = nbHotesses;
    }

    public Modele_Avion getIdModele() {
        return idModele;
    }

    public void setIdModele(Modele_Avion idModele) {
        this.idModele = idModele;
    }
    
    
}

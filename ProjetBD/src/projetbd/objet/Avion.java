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
    private Modele_Avion modele;

    public Avion(int idAvion, int nbHotesses, Modele_Avion modele) {
        this.idAvion = idAvion;
        this.nbHotesses = nbHotesses;
        this.modele = modele;
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

    public Modele_Avion getModele() {
        return modele;
    }

    public void setModele(Modele_Avion modele) {
        this.modele = modele;
    }

    
    
    
}

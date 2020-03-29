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
public class Nb_Places {
    private Avion avion;
    private Classe classe;
    private int nbPlaces;

    public Nb_Places(Avion avion, Classe classe, int nbPlaces) {
        this.avion = avion;
        this.classe = classe;
        this.nbPlaces = nbPlaces;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

   
    
    
}

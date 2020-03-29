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
public class Place_Reservee {
    private Place idPlace;
    private Panier idPanier;
    private int prix;

    public Place_Reservee(Place idPlace, Panier idPanier, int prix) {
        this.idPlace = idPlace;
        this.idPanier = idPanier;
        this.prix = prix;
    }

    public Place getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(Place idPlace) {
        this.idPlace = idPlace;
    }

    public Panier getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(Panier idPanier) {
        this.idPanier = idPanier;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    
}

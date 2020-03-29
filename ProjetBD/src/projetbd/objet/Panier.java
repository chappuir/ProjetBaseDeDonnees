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
public class Panier {
    private int idPanier;
    private Vol idVol;
    private Reservation idReservation;

    public Panier(int idPanier, Vol idVol, Reservation idReservation) {
        this.idPanier = idPanier;
        this.idVol = idVol;
        this.idReservation = idReservation;
    }

    public int getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(int idPanier) {
        this.idPanier = idPanier;
    }

    public Vol getIdVol() {
        return idVol;
    }

    public void setIdVol(Vol idVol) {
        this.idVol = idVol;
    }

    public Reservation getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Reservation idReservation) {
        this.idReservation = idReservation;
    }
    
    
}

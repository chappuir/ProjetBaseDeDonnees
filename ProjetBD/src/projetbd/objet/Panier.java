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
    private Vol vol;
    private Reservation reservation;

    public Panier(int idPanier, Vol vol, Reservation reservation) {
        this.idPanier = idPanier;
        this.vol = vol;
        this.reservation = reservation;
    }

    public int getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(int idPanier) {
        this.idPanier = idPanier;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

   
    
}
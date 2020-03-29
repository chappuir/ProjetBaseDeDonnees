/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbd.objet;

import java.sql.Date;

/**
 *
 * @author JDufo
 */
public class Reservation {
    private int idReservation;
    private Date dateRes;
    private Client idClient;

    public Reservation(int idReservation, Date dateRes, Client idClient) {
        this.idReservation = idReservation;
        this.dateRes = dateRes;
        this.idClient = idClient;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public Date getDateRes() {
        return dateRes;
    }

    public void setDateRes(Date dateRes) {
        this.dateRes = dateRes;
    }

    public Client getIdClient() {
        return idClient;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }

    
    
    
}

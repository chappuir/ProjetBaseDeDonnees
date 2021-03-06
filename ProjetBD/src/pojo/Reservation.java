/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;

/**
 *
 * @author JDufo
 */
public class Reservation {
    private int idReservation;
    private Date dateRes;
    private Client client;

    public Reservation(int idReservation, Date dateRes, Client client) {
        this.idReservation = idReservation;
        this.dateRes = dateRes;
        this.client = client;
    }
    
    public Reservation(){};

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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        String resa = "";
        resa += "idReservation : " + this.idReservation + "\n" +
                "Date : " + this.dateRes + "\n" + 
                "Client : " + this.client.getNom() + " " + this.client.getPrenom();
        return resa;
    }
    
   
}

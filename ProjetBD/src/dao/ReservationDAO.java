/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import pojo.Client;
import pojo.Reservation;

/**
 *
 * @author JDufo
 */
public class ReservationDAO extends DAO<Reservation>{

    public ReservationDAO(Connection connect) {
        super(connect);
    }


    @Override
    public Reservation find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    };

    @Override
    public Reservation create(Reservation obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reservation update(Reservation obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void deleteReservation(int idReservation) {
       try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                            "DELETE FROM Reservation WHERE idReservation = " + idReservation);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String allReservations(){
        String reservations = "idReservation -- dateResa -- client \n";
       
        try{
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Reservation");
            while (result.next()) {
               reservations += result.getInt("idReservation") + " -- ";
                reservations += result.getDate("dateRes") + " -- ";
                reservations += result.getInt("idclient") + "\n";

            }
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
            reservations = "Erreur dans allReservations";
        }

        return reservations;
    }

    @Override
    public void delete(Reservation obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ArrayList<Reservation> listeReservationsClient(int idClient){
        
        ArrayList<Reservation> resaClient = new ArrayList<Reservation>();
        DAO<Client> clientDAO = DAOFactory.getClientDAO();
        
        try{
            PreparedStatement prepare = DAOFactory.CONNECT.prepareStatement("SELECT * FROM Reservation WHERE idClient = ?");
            prepare.setInt(1, idClient);
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                resaClient.add(new Reservation(result.getInt("idReservation"),
                               result.getDate("dateRes"),
                               clientDAO.find(idClient)
                               ));
            }
        }
        
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Erreur dans listeReservationsClient");
        }
        
        return resaClient;
    }
    
    
}
    
    
    
    

    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.Vol;

/**
 *
 * @author JDufo
 */
public class VolDAO extends DAO<Vol>{

    public VolDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Vol find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vol create(Vol obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vol update(Vol obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Vol obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String findVol(int idVol){
        String avion = "idVol -- villeD -- villeA -- duree -- distance -- termine \n";
        
        try{
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Vol WHERE idVol = " + idVol);
            while (result.next()) {
               avion += result.getInt("idVol") + " -- ";
               avion += result.getString("villeD") + " -- ";
               avion += result.getString("villeA") + " -- ";
               avion += result.getFloat("duree") + " -- ";
               avion += result.getInt("distance") + " -- ";
               avion += result.getString("termine") + " \n ";
               

            }
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
            avion = "Erreur dans findAvion";
        }

            return avion;
    }
    
    public int dureeVol(int idVol) {
        int d = 0;

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT duree FROM Vol WHERE idVol = " + idVol);
            while (result.next()) {
                d += result.getInt("duree");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return d;

    }
    
    
    
    public String allVols(){
        String vols = "idVol -- villeD -- villeA -- heureD -- heureA -- duree -- distance -- idAvion -- termine \n";
       
        try{
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Vol");
            while (result.next()) {
               vols += result.getInt("idVol") + " -- ";
               vols += result.getString("villeD") + " -- ";
               vols += result.getString("villeA") + " -- ";
               vols += result.getInt("heureD") + " -- ";
               vols += result.getInt("heureA") + " -- ";
               vols += result.getFloat("duree") + " -- ";
               vols += result.getInt("distance") + " -- ";
               vols += result.getString("idAvion") + " -- ";
               vols += result.getString("termine") + " \n";
            }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
            vols = "Erreur dans allVols";
        }

        return vols;
    }
    
    public void updateVol (int leVol)
    {
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery("UPDATE Vol SET termine = 1 WHERE idVol = " + leVol);
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}

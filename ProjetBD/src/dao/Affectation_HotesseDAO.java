/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import pojo.Affectation_Hotesse;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JDufo
 */
public class Affectation_HotesseDAO extends DAO<Affectation_Hotesse>{

    public Affectation_HotesseDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Affectation_Hotesse find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Affectation_Hotesse create(Affectation_Hotesse obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Affectation_Hotesse update(Affectation_Hotesse obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Affectation_Hotesse obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void deleteAft_Hotesse(int idHotesse) {
       try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                            "DELETE FROM Affectation_Hotesse WHERE idHotesse = " + idHotesse);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String findHot_Aff(int idVol){
        String hot_aff = "idHotesse -- idVol \n";
        
        try{
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Affectation_Hotesse WHERE idVol = " + idVol);
            while (result.next()) {
               hot_aff += result.getInt("idHotesse") + " -- ";
               hot_aff += result.getInt("idVol") + " \n ";
            }
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
            hot_aff = "Erreur dans hot_aff";
        }

        return hot_aff;
    }
    
}

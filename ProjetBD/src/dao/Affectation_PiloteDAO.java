/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.Affectation_Pilote;

/**
 *
 * @author JDufo
 */
public class Affectation_PiloteDAO extends DAO<Affectation_Pilote> {

    public Affectation_PiloteDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Affectation_Pilote find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Affectation_Pilote create(Affectation_Pilote obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Affectation_Pilote update(Affectation_Pilote obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Affectation_Pilote obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void deletePil(int idPilote) {
       try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                            "DELETE FROM Affectation_Pilote WHERE idPilote = " + idPilote);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String findPil_Aff(int idVol){
        String pil_aff = "idPilote -- idVol \n";
        
        try{
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Affectation_Pilote WHERE idVol = " + idVol);
            while (result.next()) {
               pil_aff += result.getInt("idPilote") + " -- ";
               pil_aff += result.getInt("idVol") + " \n ";
            }
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
            pil_aff = "Erreur dans findPil_Aff";
        }

            return pil_aff;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.Hotesse;
import pojo.Pilote;

/**
 *
 * @author JDufo
 */
public class HotesseDAO extends DAO<Hotesse> {

    public HotesseDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Hotesse find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hotesse create(Hotesse obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hotesse update(Hotesse obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Hotesse obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String allHotesses(){
        String clients = "idHotesse -- Nom -- Prenom \n";
       
        try{
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Hotesse");
            while (result.next()) {
               clients += result.getInt("idHotesse") + " -- ";
               clients += result.getString("nom") + " -- ";
               clients += result.getString("prenom") + "\n";
            }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
            clients = "Erreur dans allHotesses";
        }

        return clients;
    }
    
    public void deleteHot(int idHotesse) {
       try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                            "DELETE FROM Hotesse WHERE idHotesse = " + idHotesse);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void addHot(Hotesse h) {
        
       try {
            PreparedStatement prepare = this.connect.prepareStatement(
                "INSERT INTO hotesse (idHotesse, nom, prenom, numero_Adr, rue_adr, codeP_adr, ville, pays, nbHeures)"
                        + "Values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            prepare.setInt(1, h.getIdHotesse());
            prepare.setString(2, h.getNom());
            prepare.setString(3, h.getPrenom());
            prepare.setString(4, h.getNumero_Adr());
            prepare.setString(5, h.getRue_adr());
            prepare.setString(6, h.getCodeP_adr());
            prepare.setString(7, h.getVille());
            prepare.setString(8, h.getPays());
            prepare.setInt(9, h.getNbHeures());
            
            prepare.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import pojo.Pilote;

/**
 *
 * @author JDufo
 */
public class PiloteDAO extends DAO<Pilote>{

    public PiloteDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Pilote find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pilote create(Pilote obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pilote update(Pilote obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pilote obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String allPilotes(){
        String clients = "idPilote -- Nom -- Prenom -- NbHeures \n";
       
        try{
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Pilote");
            while (result.next()) {
               clients += result.getInt("idPilote") + " -- ";
               clients += result.getString("nom") + " -- ";
               clients += result.getString("prenom") + " -- ";
               clients += result.getString("nbHeures") + "\n";
            }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
            clients = "Erreur dans allPilotes";
        }

        return clients;
    }
    
    public void deletePil(int idPilote) {
       try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                            "DELETE FROM Pilote WHERE idPilote = " + idPilote);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void addPil(Pilote p) {
        
       try {
            PreparedStatement prepare = this.connect.prepareStatement(
                "INSERT INTO pilote (idPilote, nom, prenom, numero_Adr, rue_adr, codeP_adr, ville, pays, nbHeures)"
                        + "Values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            prepare.setInt(1, p.getIdPilote());
            prepare.setString(2, p.getNom());
            prepare.setString(3, p.getPrenom());
            prepare.setString(4, p.getNumero_Adr());
            prepare.setString(5, p.getRue_adr());
            prepare.setString(6, p.getCodeP_adr());
            prepare.setString(7, p.getVille());
            prepare.setString(8, p.getPays());
            prepare.setInt(9, p.getNbHeures());
            
            prepare.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String dureePilote(int idPilote) {
        String res = "";

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT nbHeures FROM Pilote WHERE idPilote = " + idPilote);
            while (result.next()) {
                res += result.getInt("nbHeures");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;

    }
    
    public void updatePil(int nvDuree, int idPilote){
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                            "UPDATE Pilote SET nbHeures = " + nvDuree +
                                    " WHERE idPilote = " + idPilote
                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
}    

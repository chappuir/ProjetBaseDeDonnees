/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.Panier;

/**
 *
 * @author JDufo
 */
public class PanierDAO extends DAO<Panier>{

    public PanierDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Panier find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Panier create(Panier obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Panier update(Panier obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Panier obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void deletePanier(int idReservation) {
       try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                            "DELETE FROM Panier WHERE idReservation = " + idReservation);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String panierResa(int idReservation) {
        String pResa = "idPanier -- idVol -- idReservation\n";

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Panier WHERE idReservation = " + idReservation);
            while (result.next()) {
                pResa += result.getInt("idPanier") + " -- ";
                pResa += result.getInt("idVol") + " -- ";
                pResa += result.getInt("idReservation") + "\n";

            }
        } catch (SQLException e) {
            e.printStackTrace();
            pResa = "Erreur dans panierResa";
        }

        return pResa;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.Place_Reservee;

/**
 *
 * @author JDufo
 */
public class Place_ReserveeDAO extends DAO<Place_Reservee>{

    public Place_ReserveeDAO(Connection connect) {
        super(connect);
    }

   

    @Override
    public Place_Reservee find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Place_Reservee create(Place_Reservee obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Place_Reservee update(Place_Reservee obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void deleteResa(int idPanier) {
       try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                            "DELETE FROM Place_Reservee WHERE idPanier = " + idPanier);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        
    }

    @Override
    public void delete(Place_Reservee obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String placeResa(int idPanier) {
        String placeResa = "idPlace -- idPanier -- Prix\n";

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Place_Reservee WHERE idPanier = " + idPanier);
            while (result.next()) {
                placeResa += result.getInt("idPlace") + " -- ";
                placeResa += result.getInt("idPanier") + " -- ";
                placeResa += result.getInt("prix") + "\n";

            }
        } catch (SQLException e) {
            e.printStackTrace();
            placeResa = "Erreur dans placeResa";
        }

        return placeResa;
    }
}

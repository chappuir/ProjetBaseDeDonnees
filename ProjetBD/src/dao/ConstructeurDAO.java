/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import pojo.Constructeur;

/**
 *
 * @author JDufo
 */
public class ConstructeurDAO extends DAO<Constructeur> {

    public ConstructeurDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Constructeur find(int id) {
        Constructeur cons = new Constructeur();

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Constructeur WHERE idConstructeur = " + id);
            if (result.first()) {
                cons = new Constructeur(
                        id,
                        result.getString("nom")
                        );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

    @Override
    public Constructeur create(Constructeur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Constructeur update(Constructeur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Constructeur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

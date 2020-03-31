/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.Qualification;

/**
 *
 * @author JDufo
 */
public class QualificationDAO extends DAO<Qualification>{

    public QualificationDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Qualification find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Qualification create(Qualification obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Qualification update(Qualification obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Qualification obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void deletePilQualif(int idPilote) {
       try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE).executeQuery(
                            "DELETE FROM Qualification WHERE idPilote = " + idPilote);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
}

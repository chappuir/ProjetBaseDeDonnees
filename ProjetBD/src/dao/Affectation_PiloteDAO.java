/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
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
    
}

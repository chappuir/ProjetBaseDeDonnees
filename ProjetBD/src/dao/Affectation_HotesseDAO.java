/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import pojo.Affectation_Hotesse;

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
    
}
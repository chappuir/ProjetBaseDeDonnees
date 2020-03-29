/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import projetbd.TheConnection;


/**
 *
 * @author JDufo
 */
public class DAOFactory {
    
    protected static final Connection CONNECT = TheConnection.getInstance();
    
    public static DAO getClasseDAO(){
        return new ClasseDAO(CONNECT);
    }
    
    public static DAO getPositionDAO(){
        return new PositionDAO(CONNECT);
    }
    
    public static DAO getClientDAO(){
        return new ClientDAO(CONNECT);
    }
    
    public static DAO getReservationDAO(){
        return new ReservationDAO(CONNECT);
    }
    
    public static DAO getLangueDAO(){
        return new LangueDAO(CONNECT);
    }
    
    public static DAO getConstructeurDAO(){
        return new ConstructeurDAO(CONNECT);
    }
    
    public static DAO getPiloteDAO(){
        return new PiloteDAO(CONNECT);
    }
     
    public static DAO getHotesseDAO(){
        return new HotesseDAO(CONNECT);
    }
    
    public static DAO getModele_AvionDAO(){
        return new Modele_AvionDAO(CONNECT);
    }
    
    public static DAO getAvionDAO(){
        return new AvionDAO(CONNECT);
    }
    
    public static DAO getPlaceDAO(){
        return new PlaceDAO(CONNECT);
    }
     
    public static DAO getVolDAO(){
        return new VolDAO(CONNECT);
    }
    
    public static DAO getAffectation_PiloteDAO(){
        return new Affectation_PiloteDAO(CONNECT);
    }
    
    public static DAO getAffectation_HotesseDAO(){
        return new Affectation_HotesseDAO(CONNECT);
    }
    
    public static DAO getQualificationDAO(){
        return new QualificationDAO(CONNECT);
    }
    
    public static DAO getParlerDAO(){
        return new ParlerDAO(CONNECT);
    }
    
    public static DAO getNb_PlacesDAO(){
        return new ParlerDAO(CONNECT);
    }
    
    public static DAO getPanierDAO(){
        return new ParlerDAO(CONNECT);
    }
    
    public static DAO getPlace_ReserveeDAO(){
        return new ParlerDAO(CONNECT);
    }
}

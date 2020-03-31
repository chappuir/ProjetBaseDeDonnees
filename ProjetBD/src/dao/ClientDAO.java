/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.Client;

/**
 *
 * @author JDufo
 */
public class ClientDAO extends DAO<Client>{

    public ClientDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Client find(int id) {
        Client cli = new Client();

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Client WHERE idClient = " + id);
            if (result.first()) {
                 cli = new Client(
                        id,
                        result.getString("nom"),
                        result.getString("prenom"),
                        result.getString("numero_adr"),
                        result.getString("rue_adr"),
                        result.getString("codeP_adr"),
                        result.getString("ville"),
                        result.getString("pays"),
                        result.getString("noPasseport"),
                        result.getInt("heuresVol"),
                        result.getInt("ptsFidelite"),
                        result.getInt("reductionImm")
                        );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cli;
    }

    @Override
    public Client create(Client obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client update(Client obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Client obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String allClients(){
        String clients = "idClient -- Nom -- Prenom \n";
       
        try{
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM Client");
            while (result.next()) {
               clients += result.getInt("idClient") + " -- ";
               clients += result.getString("nom") + " -- ";
               clients += result.getString("prenom") + "\n";
            }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
            clients = "Erreur dans allClients";
        }

    return clients;
    }
}

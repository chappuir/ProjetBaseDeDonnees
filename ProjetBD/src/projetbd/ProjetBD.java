/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbd;

import dao.*;
import dao.ReservationDAO;
import java.sql.*;
import java.util.ArrayList;
import pojo.*;

/**
 *
 * @author JDufo
 */
public class ProjetBD {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       try {
  	    // Enregistrement du driver Oracle
  	    //System.out.print("Loading Oracle driver... "); 
  	    //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());  	    
            //System.out.println("loaded");
  	
  	    // Etablissement de la connection
            Statement requete = TheConnection.getInstance().createStatement();
            
            //Exemple requete
            /*ResultSet resultat = requete.executeQuery("SELECT nom FROM Pilote");
  	    while(resultat.next()) { // récupération des résultats
                System.out.println("nom = " + resultat.getString("nom"));
                }
            
            requete.close();
            resultat.close();
      
  	    System.out.println("bye.");
            */
            
            
            //TestDAO
            /*DAO<Constructeur> constructeurDAO = DAOFactory.getConstructeurDAO();
            
            for(int i = 1; i<3; i++){
                Constructeur cons = constructeurDAO.find(i);
                System.out.println("idConstructeur " + cons.getIdConstructeur() + " - Nom: " 
                        + cons.getNom());
            }
  	    */
            
            //TestFindReservation
            /*Connection connect = TheConnection.getInstance();
            ReservationDAO resaDAO = new ReservationDAO(connect);
            
            System.out.println(resaDAO.AllReservations());
            */
            
            //8
            //Connexion
            Connection connect = TheConnection.getInstance();
            
            //Clients
            ClientDAO clientDAO = new ClientDAO(connect);
            System.out.println(clientDAO.allClients());
            //DAO<Client> clientDAO = DAOFactory.getClientDAO();
            
            //Reéservation du client
            ReservationDAO resaDAO = new ReservationDAO(connect);
            
            ArrayList<Reservation> resaCli = ReservationDAO.listeReservationsClient(1);
            for(Reservation r : resaCli){
                System.out.println(r);
            }
            
            //Affichage Panier selon Reservation
            PanierDAO panierDAO = new PanierDAO(connect);
            System.out.println(panierDAO.panierResa(1));
            
            //Affichage Place_Reservee selon le panier
            Place_ReserveeDAO placeDAO = new Place_ReserveeDAO(connect);
            System.out.println(placeDAO.placeResa(1));
            
            //Suppression Place_Reservee
            placeDAO.deleteResa(1);
            
            //Suppression Panier
            panierDAO.deletePanier(1);
            
            //Suppression Reservation
            resaDAO.deleteReservation(1);
  
            //Affiche un client
            //Client cli = clientDAO.find(4);
            //System.out.println("idClient: " + cli.getIdClient() + " - Nom: " + cli.getNom() + " - Prenom: " + cli.getPrenom());
           
            //resaDAO.delete(Integer.toString(1));
            //System.out.println(resaDAO.AllReservations());
            
            
            
            //Suppression Reservation
            
            
            /*ReservationDAO resaDAO = new ReservationDAO(connect);
            System.out.println(resaDAO.AllReservations());
            resaDAO.deleteReservation(1);
            System.out.println(resaDAO.AllReservations());*/
            
            /*PanierDAO pDAO = new PanierDAO(connect);
            System.out.println(pDAO.PanierResa(1));
            
            Place_ReserveeDAO placeDAO = new Place_ReserveeDAO(connect);
            System.out.println(placeDAO.PlaceResa(1));
            placeDAO.deleteResa(1);
            System.out.println(placeDAO.PlaceResa(1));
            pDAO.deletePanier(1);
            System.out.println(pDAO.PanierResa(1));*/
            
            
            /*for(int i = 1; i<10; i++){
                //System.out.println(reservationDAO.find(i).toString());
                
                Reservation resa = reservationDAO.find(i);
                System.out.println("idReservation" + resa.getIdReservation() + " - Date: " 
                        + resa.getDateRes());
            }*/
            
            
  	    // traitement d'exception
          } 
       
            catch (SQLException e) {
              System.err.println("failed");
              System.out.println("Affichage de la pile d'erreur");
  	          e.printStackTrace(System.err);
              System.out.println("Affichage du message d'erreur");
              System.out.println(e.getMessage());
              System.out.println("Affichage du code d'erreur");
  	          System.out.println(e.getErrorCode());	    

          } 
    }
    
}

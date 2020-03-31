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
  	    //Enregistrement du driver Oracle
  	    //System.out.print("Loading Oracle driver... "); 
  	    //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());  	    
            //System.out.println("loaded");
  	
  	    // Etablissement de la connection
            Statement requete = TheConnection.getInstance().createStatement();
            
            Connection connect = TheConnection.getInstance();
            
            //7
            //Affichage de tout les vols
            VolDAO vDAO = new VolDAO(connect);
            System.out.println(vDAO.allVols());
            //4
            System.out.println(vDAO.findVol(1));
            Affectation_PiloteDAO affDAO = new Affectation_PiloteDAO(connect);
            System.out.println(affDAO.findPil_Aff(1));
            System.out.println(vDAO.dureeVol(1));
            
            //Durée Vol
            int i = Integer.parseInt(vDAO.dureeVol(1));
            System.out.println(i);
            
            //Update¨Pilote
            PiloteDAO pDAO = new PiloteDAO(connect);
            int nbHeuresPilote = Integer.parseInt(pDAO.dureePilote(1));
            System.out.println(nbHeuresPilote);
            
            int newNbHeurePi = i + nbHeuresPilote;
            System.out.println(newNbHeurePi);
            
            pDAO.updatePil(newNbHeurePi, 1);
            System.out.println(pDAO.allPilotes());
            
            //Update Qualification
            
            //Update Hotesse
            //Hotesses selon le vol
            Affectation_HotesseDAO aH = new Affectation_HotesseDAO(connect);
            System.out.println(aH.findHot_Aff(1));
            
            //Recuperation nbHeures Hotesse
            HotesseDAO hDAO = new HotesseDAO(connect);
            int nbHeuresHotesse = Integer.parseInt(hDAO.dureeHot(2));
            System.out.println(nbHeuresHotesse);
            
            int newNbHeureHot = i + nbHeuresHotesse;
            System.out.println(newNbHeureHot);
            
            hDAO.updateHot(newNbHeureHot, 2);
            System.out.println(hDAO.allHotesses());
            
            //Update Hotesse
            
            
            
            
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
            
            //5
            //Supression
            
            //PiloteDAO pilotesDAO = new PiloteDAO(connect);
            //System.out.println(pilotesDAO.allPilotes());
            
            //HotesseDAO hotessesDAO = new HotesseDAO(connect);
            //System.out.println(hotessesDAO.allHotesses());
            
            //Hotesse
            //Affectation_HotesseDAO aft_hotDAO = new Affectation_HotesseDAO(connect);
            //aft_hotDAO.deleteAft_Hotesse(1);
            
            //ParlerDAO parlerDAO = new ParlerDAO(connect);
            //parlerDAO.deleteParlerHot(1);
            
            //HotesseDAO hotesseDAO = new HotesseDAO(connect);
            //hotessesDAO.deleteHot(1);
            
            //Pilote
            //Affectation_PiloteDAO aft_pilDAO = new Affectation_PiloteDAO(connect);
            //aft_pilDAO.deletePil(1);
            
            //QualificationDAO qualifDAO = new QualificationDAO(connect);
            //qualifDAO.deletePilQualif(1);
            
            //PiloteDAO piloteDAO = new PiloteDAO(connect);
            //piloteDAO.deletePil(1);
            
            //Ajout
            
            //Pilote
            //PiloteDAO pDAO = new PiloteDAO(connect);
            //Pilote p = new Pilote(5, "Chappuis", "Robin", "20", "rue de la mort", "69000", "Lyon", "France", 0);
            //pDAO.addPil(p);
            
            //Hotesse
            //HotesseDAO hDAO = new HotesseDAO(connect);
            //Hotesse h = new Hotesse(1, "Chappuis", "Robine", "20", "rue de la mort", "69000", "Lyon", "France", 0);
            //hDAO.addHot(h);
            
            
            
            
            //6
            /*
            java.util.Scanner entree = new java.util.Scanner(System.in);
            System.out.println("Donner l'id du Client: ");
            int cli = entree.nextInt();
            
            ArrayList<Reservation> resaCli = ReservationDAO.listeReservationsClient(cli);
            for(Reservation r : resaCli){
                System.out.println(r);
            }
            */
            
            //8
            /*//Connexion
            Connection connect = TheConnection.getInstance();
            
            //Clients
            ClientDAO clientsDAO = new ClientDAO(connect);
            System.out.println(clientsDAO.allClients());
            //DAO<Client> clientDAO = DAOFactory.getClientDAO();
            
            //Reéservation du client
            //ReservationDAO resaDAO = new ReservationDAO(connect);
            
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
            
            //Fin *
            */
  
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbd;

import dao.*;
import java.sql.*;
import pojo.*;
import java.util.ArrayList;

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

            String commande = "";

            do
            {
                java.util.Scanner entree = new java.util.Scanner(System.in);
                java.util.Scanner entreeInt = new java.util.Scanner(System.in);
                System.out.println("----------------------------\n"
                                    + "Que voulez-vous faire : \n Gérer les réservations : tapez 'reservation'\n"
                                    + "Gérer le personnel : tapez 'personnel' \n" 
                                    + "Gérer les vols : tapez 'vols'\n"
                                    + "Quitter : tapez 'quitter'\n"
                                    + "----------------------------");
                commande = entree.nextLine();
                
                // 6 -- 7 -- 8
                if(commande.equals("reservation"))
                {
                    ClientDAO clientsDAO = new ClientDAO(connect);
                    System.out.println(clientsDAO.allClients());
                    
                    System.out.println("Veuillez sélectionner l'identifiant du client dont vous voulez traiter les commandes : ");
                    int idCli = entreeInt.nextInt();
                    
                    
                    
                    System.out.println("Voulez-vous : \n"
                                        + "ajouter une réservation : tapez 'ajouter'\n"
                                        + "supprimer une réservation : tapez 'supprimer'\n"
                                        + "consulter les réservation : tapez 'consulter'");
                    
                    String commandeReservation = entree.nextLine();
                    
                    if(commandeReservation.equals("ajouter"))
                    {
                        // affichage des vols
                        // demande à l'utilisateur des vols voulus
                        
                        // affichage des places disponibles pour ce vol
                        // demande à l'utilisateur des places voulues
                    }
                    else if(commandeReservation.equals("supprimer"))
                    {
                        ArrayList<Reservation> resaCli = ReservationDAO.listeReservationsClient(idCli);
                        for(Reservation r : resaCli)
                        {
                            System.out.println(r);
                        }
                        
                        System.out.println("Sélectionnez l'identifiant de la réservation à supprimer : ");
                        int idRes = entree.nextInt();
                        
                        PanierDAO panierDAO = new PanierDAO(connect);
                        /*ArrayList<Panier> panRes = panierDAO.(idRes);
                        
                        for(Panier p : panRes)
                        {
                            Place_ReserveeDAO plResDAO = new Place_ReserveeDAO(connect);
                            ArrayList<Place_Reservee> plaResRes = plResDAO.listePlacesRPanier();
                            
                            for(Place_Reservee pr : plaResRes)
                            {
                                //Suppression Place_Reservee
                                placeDAO.deleteResa(pr.getPlace().getIdPlace(), pr.getPanier().getIdPanier());
                            }
                            
                            PanierDAO.deletePanier(p.getIdPanier());
                        }
                        ReservationDAO.deleteReservation(idRes);
                        */
                        
                        
                    }
                    else if(commandeReservation.equals("consulter"))
                    {
                        ArrayList<Reservation> resaCli = ReservationDAO.listeReservationsClient(idCli);
                        for(Reservation r : resaCli)
                        {
                            System.out.println(r);
                        }
                        
                        // Il serait nécessaire de prendre en compte les paniers et les places réservées
                    }
                    else
                    {
                        System.out.println("commande de gestion des reservations non reconnue");
                    }
                }
                else if(commande.equals("personnel"))
                {
                    System.out.println("Voulez vous gérer ? \n"
                                        + "les hôtesses : tapez 'hotesses'\n"
                                        + "les pilotes : tapez 'pilotes'");
                    String commandePersonnel = entree.nextLine();
                    
                    if(commandePersonnel.equals("hotesses"))
                    {
                        System.out.println("tapez ('supprimer' ou 'ajouter')");
                        String commPersAction = entree.nextLine();
                        
                        if(commPersAction.equals("ajouter"))
                        {
                            System.out.println("identifiant : ");
                            int idH = entreeInt.nextInt();
                            System.out.println("nom : ");
                            String nomH = entree.nextLine();
                            System.out.println("prenom : ");
                            String prenomH = entree.nextLine();
                            System.out.println("numéro d'adresse : ");
                            String noAdrH = entree.nextLine();
                            System.out.println("rue : ");
                            String rueH = entree.nextLine();
                            System.out.println("code postal : ");
                            String codePH = entree.nextLine();
                            System.out.println("ville : ");
                            String villeH = entree.nextLine();
                            System.out.println("Pays : ");
                            String paysH = entree.nextLine();
                            System.out.println("nombre d'heures de vol : ");
                            int nbHeuresH = entree.nextInt();
                            
                            
                            HotesseDAO hDAO = new HotesseDAO(connect);
                            Hotesse h = new Hotesse(idH, nomH, prenomH, noAdrH, rueH, codePH, villeH, paysH, nbHeuresH);
                            hDAO.addHot(h);
                        }
                        else if(commPersAction.equals("supprimer"))
                        {
                            HotesseDAO hotessesDAO = new HotesseDAO(connect);
                            System.out.println(hotessesDAO.allHotesses() + "\n\n");
                            System.out.println("Entrez l'identifiant de l'hôtesse à supprimer :");
                            
                            int idHotesseSuppr = entree.nextInt();
            
                            Affectation_HotesseDAO aft_hotDAO = new Affectation_HotesseDAO(connect);
                            aft_hotDAO.deleteAft_Hotesse(idHotesseSuppr);
            
                            ParlerDAO parlerDAO = new ParlerDAO(connect);
                            parlerDAO.deleteParlerHot(idHotesseSuppr);
            
                            HotesseDAO hotesseDAO = new HotesseDAO(connect);
                            hotessesDAO.deleteHot(idHotesseSuppr);
                        }
                        else
                        {
                            System.out.println("commande de gestion des hôtesses non reconnue");
                        }
                    }
                    else if(commandePersonnel.equals("pilotes"))
                    {
                        System.out.println("tapez ('supprimer' ou 'ajouter')");
                        String commPersAction = entree.nextLine();
                        
                        if(commPersAction.equals("ajouter"))
                        {
                            System.out.println("identifiant : ");
                            int idP = entreeInt.nextInt();
                            System.out.println("nom : ");
                            String nomP = entree.nextLine();
                            System.out.println("prenom : ");
                            String prenomP = entree.nextLine();
                            System.out.println("numéro d'adresse : ");
                            String noAdrP = entree.nextLine();
                            System.out.println("rue : ");
                            String rueP = entree.nextLine();
                            System.out.println("code postal : ");
                            String codePP = entree.nextLine();
                            System.out.println("ville : ");
                            String villeP = entree.nextLine();
                            System.out.println("Pays : ");
                            String paysP = entree.nextLine();
                            System.out.println("nombre d'heures de vol : ");
                            int nbHeuresP = entree.nextInt();
                            
                            
                            PiloteDAO pDAO = new PiloteDAO(connect);
                            Pilote p = new Pilote(idP, nomP, prenomP, noAdrP, rueP, codePP, villeP, paysP, nbHeuresP);
                            pDAO.addPil(p);
                        }
                        else if(commPersAction.equals("supprimer"))
                        {
                            PiloteDAO pilotesDAO = new PiloteDAO(connect);
                            System.out.println(pilotesDAO.allPilotes() + "\n\n");
                            System.out.println("Entrez l'identifiant du pilote à supprimer :");
                            
                            int idPiloteSuppr = entree.nextInt();
                            
                            Affectation_PiloteDAO aft_pilDAO = new Affectation_PiloteDAO(connect);
                            aft_pilDAO.deletePil(idPiloteSuppr);
            
                            QualificationDAO qualifDAO = new QualificationDAO(connect);
                            qualifDAO.deletePilQualif(idPiloteSuppr);
            
                            PiloteDAO piloteDAO = new PiloteDAO(connect);
                            piloteDAO.deletePil(idPiloteSuppr);
                        }
                        else
                        {
                            System.out.println("commande de gestion des pilotes non reconnue");
                        } 
                    }
                    else
                    {
                        System.out.println("commande de gestion du personnel non reconnue");
                    }
                }
                else if(commande.equals("vols"))
                {
                    System.out.println("Voules-vous :\n"
                                        + "Prévoir un nouveau vol : tapez 'nouveau'\n"
                                        + "Annuler un vol : tapez 'annuler'\n"
                                        + "Confirmer l'arrivée d'un vol : tapez 'terminer'");
                    
                    String commandeVol = entree.nextLine();
                    if(commandeVol.equals("nouveau"))
                    {
                        
                    }
                    else if(commandeVol.equals("annuler"))
                    {
                        
                    }
                    else if(commandeVol.equals("terminer"))
                    {
                        VolDAO vDAO = new VolDAO(connect);
                        System.out.println(vDAO.allVols());
                        System.out.println("Sélectionnez l'identifiant du vol à terminer : ");
                        
                        int idVol = entreeInt.nextInt();
                        VolDAO volDAO = new VolDAO(connect);
                        volDAO.updateVol(idVol);
                        
                        Affectation_PiloteDAO affPilDAO = new Affectation_PiloteDAO(connect);
                        affPilDAO.findPil_Aff(idVol);
                        
                        System.out.println("Entrez l'identifiant du pilote auquel vous voulez ajouter des heures");
                        int idPilAjHe = entreeInt.nextInt();
                        
                        System.out.println("Entrez l'identifiant de l'hotesse auquel vous voulez ajouter des heures");
                        int idHotAjHe = entreeInt.nextInt();
                        
                        int nbHeures = volDAO.dureeVol(idVol);
                        
                        PiloteDAO pilDAO = new PiloteDAO(connect);
                        int durActuelle = pilDAO.dureePilote(idPilAjHe);
                        durActuelle += nbHeures;
                        pilDAO.updatePil(nbHeures, idPilAjHe);
                        
                        HotesseDAO hotDAO = new HotesseDAO(connect);
                        int durActuelleH = hotDAO.dureeHotesse(idHotAjHe);
                        durActuelleH += nbHeures;
                        hotDAO.updateHot(nbHeures, idHotAjHe);
                        
                        
                        System.out.println("Mise-à-jour effectuée");
                        
                    }
                    else
                    {
                        System.out.println("commande de gestion des vols non reconnue");
                    }
                }
                else if(commande.equals("quitter"))
                {
                    System.out.println("Au revoir.");
                }
                else
                {
                    System.out.println("Commande de base non reconnue \n");
                }
            } while (! commande.equals("quitter"));
                    

            
            

            /*
            //Réservation du client
            ReservationDAO resaDAO = new ReservationDAO(connect);
            
            
            
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
            */
            
            //Fin *
             
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
            /*       
            
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
        } catch (SQLException e) {
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

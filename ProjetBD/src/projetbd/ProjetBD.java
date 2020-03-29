/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbd;

import java.sql.*;

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
            ResultSet resultat = requete.executeQuery("SELECT nom FROM Pilote");
  	    while(resultat.next()) { // récupération des résultats
                System.out.println("nom = " + resultat.getString("nom"));
                }
            
            requete.close();
            resultat.close();
      
  	    System.out.println("bye.");
            
            
  	    
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

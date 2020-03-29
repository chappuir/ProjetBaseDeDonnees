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
    
    private static final String CONFIGURATION_FILE = "src/projetbd/BD.properties";
    static Connection conn;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    

        // TODO code application logic here
        
       try {
  	    // Enregistrement du driver Oracle
  	    System.out.print("Loading Oracle driver... "); 
  	    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());  	    
            System.out.println("loaded");
  	
  	    // Etablissement de la connection
	    DatabaseAccessProperties dap = new DatabaseAccessProperties(CONFIGURATION_FILE);
  	    System.out.print("Connecting to the database... "); 
 	    conn = DriverManager.getConnection(dap.getDatabaseUrl(), dap.getUsername(),dap.getPassword());
   	    System.out.println("connected");
            
            Statement requete = conn.createStatement();
            
            ResultSet resultat = requete.executeQuery("SELECT nomClasse FROM Classe");
  	    while(resultat.next()) { // récupération des résultats
                System.out.println("nomClasse = " + resultat.getString("nomClasse"));
                }
            
            requete.close();
            resultat.close();
            conn.close();
  	    //conn.setAutoCommit(true);
            
            /*String req = "SELECT * FROM CLASSE";
            
            try ( Statement statement = conn.createStatement() ){
                
                ResultSet resultSet = statement.executeQuery(req);
                while(resultSet.next()){
                    String idClasse = resultSet.getString("idClasse");
                    String nomClasse = resultSet.getString("nomClasse");
                    
                    System.out.printf("%s, %s\n", idClasse, nomClasse);
                }
            }*/

	    // code m�tier de la fonctionnalit�

  	    // Liberation des ressources et fermeture de la connexion...
            // A COMPLETER
            
           // /*conn.close(); 
 	    
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

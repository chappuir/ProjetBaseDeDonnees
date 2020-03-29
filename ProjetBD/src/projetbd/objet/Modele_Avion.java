/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbd.objet;

/**
 *
 * @author JDufo
 */
public class Modele_Avion {
    private int idModele;
    private String nomModele;
    private int nbHeuresNecessairesPilotage;
    private int nbPilotesNecessaires;
    private Constructeur idConstructeur;

    public Modele_Avion(int idModele, String nomModele, int nbHeuresNecessairesPilotage, int nbPilotesNecessaires, Constructeur idConstructeur) {
        this.idModele = idModele;
        this.nomModele = nomModele;
        this.nbHeuresNecessairesPilotage = nbHeuresNecessairesPilotage;
        this.nbPilotesNecessaires = nbPilotesNecessaires;
        this.idConstructeur = idConstructeur;
    }

    public int getIdModele() {
        return idModele;
    }

    public void setIdModele(int idModele) {
        this.idModele = idModele;
    }

    public String getNomModele() {
        return nomModele;
    }

    public void setNomModele(String nomModele) {
        this.nomModele = nomModele;
    }

    public int getNbHeuresNecessairesPilotage() {
        return nbHeuresNecessairesPilotage;
    }

    public void setNbHeuresNecessairesPilotage(int nbHeuresNecessairesPilotage) {
        this.nbHeuresNecessairesPilotage = nbHeuresNecessairesPilotage;
    }

    public int getNbPilotesNecessaires() {
        return nbPilotesNecessaires;
    }

    public void setNbPilotesNecessaires(int nbPilotesNecessaires) {
        this.nbPilotesNecessaires = nbPilotesNecessaires;
    }

    public Constructeur getIdConstructeur() {
        return idConstructeur;
    }

    public void setIdConstructeur(Constructeur idConstructeur) {
        this.idConstructeur = idConstructeur;
    }

    
    
    
}

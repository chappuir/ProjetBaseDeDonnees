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
public class Pilote {
    private int idPilote;
    private String nom;
    private String prenom;
    private String numero_Adr;
    private String rue_adr;
    private String codeP_adr;
    private String ville;
    private String pays;
    private int nbHeures;

    public Pilote(int idPilote, String nom, String prenom, String numero_Adr, String rue_adr, String codeP_adr, String ville, String pays, int nbHeures) {
        this.idPilote = idPilote;
        this.nom = nom;
        this.prenom = prenom;
        this.numero_Adr = numero_Adr;
        this.rue_adr = rue_adr;
        this.codeP_adr = codeP_adr;
        this.ville = ville;
        this.pays = pays;
        this.nbHeures = 0;
    }

    public int getIdPilote() {
        return idPilote;
    }

    public void setIdPilote(int idPilote) {
        this.idPilote = idPilote;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumero_Adr() {
        return numero_Adr;
    }

    public void setNumero_Adr(String numero_Adr) {
        this.numero_Adr = numero_Adr;
    }

    public String getRue_adr() {
        return rue_adr;
    }

    public void setRue_adr(String rue_adr) {
        this.rue_adr = rue_adr;
    }

    public String getCodeP_adr() {
        return codeP_adr;
    }

    public void setCodeP_adr(String codeP_adr) {
        this.codeP_adr = codeP_adr;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }
    
    
    
    
}

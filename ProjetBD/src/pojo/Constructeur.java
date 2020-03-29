/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author JDufo
 */
public class Constructeur {
    private int idConstructeur;
    private String nom;

    public Constructeur(int idConstructeur, String nom) {
        this.idConstructeur = idConstructeur;
        this.nom = nom;
    }

    public int getIdConstructeur() {
        return idConstructeur;
    }

    public void setIdConstructeur(int idConstructeur) {
        this.idConstructeur = idConstructeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}

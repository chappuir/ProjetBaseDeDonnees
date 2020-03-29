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
public enum Classe {
    PREMIERE(1, "premiere"),
    AFFAIRE(2, "affaire"),
    ECO(3, "economique");
    
    private int idClasse;
    private String nomClasse;

    private Classe(int idClasse, String nomClasse) {
        this.idClasse = idClasse;
        this.nomClasse = nomClasse;
    }

    public int getIdClasse() {
        return idClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    
    
    

   
    
}

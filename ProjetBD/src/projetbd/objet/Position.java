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
public enum Position {
    
    HUBLOT(1, "hublot"),
    COULOIR(2, "couloir"),
    CENTRE (3, "CENTRE");
    
    private int idPosition;
    private String nomPosition;

    private Position(int idPosition, String nomPosition) {
        this.idPosition = idPosition;
        this.nomPosition = nomPosition;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public String getNomPosition() {
        return nomPosition;
    }
    
    

    
    
   
}

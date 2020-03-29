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
public class Affectation_Pilote {
    private Pilote pilote;
    private Vol vol;

    public Affectation_Pilote(Pilote pilote, Vol vol) {
        this.pilote = pilote;
        this.vol = vol;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    
    
    
    
}

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
    private Pilote idPilote;
    private Vol idVol;

    public Affectation_Pilote(Pilote idPilote, Vol idVol) {
        this.idPilote = idPilote;
        this.idVol = idVol;
    }

    public Pilote getIdPilote() {
        return idPilote;
    }

    public void setIdPilote(Pilote idPilote) {
        this.idPilote = idPilote;
    }

    public Vol getIdVol() {
        return idVol;
    }

    public void setIdVol(Vol idVol) {
        this.idVol = idVol;
    }
    
    
    
}

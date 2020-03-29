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
public class Affectation_Hotesse {
    private Hotesse idHotesse;
    private Vol idVol;

    public Affectation_Hotesse(Hotesse idHotesse, Vol idVol) {
        this.idHotesse = idHotesse;
        this.idVol = idVol;
    }

    public Hotesse getIdHotesse() {
        return idHotesse;
    }

    public void setIdHotesse(Hotesse idHotesse) {
        this.idHotesse = idHotesse;
    }

    public Vol getIdVol() {
        return idVol;
    }

    public void setIdVol(Vol idVol) {
        this.idVol = idVol;
    }
    
    
}

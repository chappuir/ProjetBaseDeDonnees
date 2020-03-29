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
public class Affectation_Hotesse {
    private Hotesse hotesse;
    private Vol vol;

    public Affectation_Hotesse(Hotesse hotesse, Vol vol) {
        this.hotesse = hotesse;
        this.vol = vol;
    }

    public Hotesse getHotesse() {
        return hotesse;
    }

    public void setHotesse(Hotesse hotesse) {
        this.hotesse = hotesse;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    
    
}

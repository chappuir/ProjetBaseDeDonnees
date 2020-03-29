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
public class Parler {
    private Hotesse hotesse;
    private Langue langue;

    public Parler(Hotesse hotesse, Langue langue) {
        this.hotesse = hotesse;
        this.langue = langue;
    }

    public Hotesse getHotesse() {
        return hotesse;
    }

    public void setHotesse(Hotesse hotesse) {
        this.hotesse = hotesse;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    
}

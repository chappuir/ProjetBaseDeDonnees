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
public class Parler {
    private Hotesse idHotesse;
    private Langue idLangue;

    public Parler(Hotesse idHotesse, Langue idLangue) {
        this.idHotesse = idHotesse;
        this.idLangue = idLangue;
    }

    public Hotesse getIdHotesse() {
        return idHotesse;
    }

    public void setIdHotesse(Hotesse idHotesse) {
        this.idHotesse = idHotesse;
    }

    public Langue getIdLangue() {
        return idLangue;
    }

    public void setIdLangue(Langue idLangue) {
        this.idLangue = idLangue;
    }
    
    
}

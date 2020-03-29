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
public class Place {
    private int idPlace;
    private Classe classe;
    private Position position;
    private Avion avion;

    public Place(int idPlace, Classe classe, Position position, Avion avion) {
        this.idPlace = idPlace;
        this.classe = classe;
        this.position = position;
        this.avion = avion;
    }

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    
    
}

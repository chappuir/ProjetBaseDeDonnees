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
public class Vol {
    private int idVol;
    private String villeD;
    private String villeA;
    private int heureD;
    private int heureA;
    private int duree;
    private int distance;
    private Avion avion;
    private String termine;


    public Vol(int idVol, String villeD, String villeA, int heureD, int heureA, int duree, int distance, Avion avion, String termine) {
        this.idVol = idVol;
        this.villeD = villeD;
        this.villeA = villeA;
        this.heureD = heureD;
        this.heureA = heureA;
        this.duree = duree;
        this.distance = distance;
        this.avion = avion;
        this.termine = termine;
    }

    public int getIdVol() {
        return idVol;
    }

    public void setIdVol(int idVol) {
        this.idVol = idVol;
    }

    public String getVilleD() {
        return villeD;
    }

    public void setVilleD(String villeD) {
        this.villeD = villeD;
    }

    public String getVilleA() {
        return villeA;
    }

    public void setVilleA(String villeA) {
        this.villeA = villeA;
    }

    public int getHeureD() {
        return heureD;
    }

    public void setHeureD(int heureD) {
        this.heureD = heureD;
    }

    public int getHeureA() {
        return heureA;
    }

    public void setHeureA(int heureA) {
        this.heureA = heureA;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String isTermine() {
        return termine;
    }

    public void setTermine(String termine) {
        this.termine = termine;
    }
    
    @Override
    public String toString()
    {
        String volToString = "";
        volToString += " Numéro de vol : "+this.getIdVol()+
                        "\n Lieu de départ : "+this.getVilleD()+" Lieu d'arrivée : "+this.getVilleA()+
                        "\n Heure de départ : "+this.getHeureD()+" Heure d'arrivée : "+this.getHeureA()+"\n";
        return volToString;
    }
    
    
}

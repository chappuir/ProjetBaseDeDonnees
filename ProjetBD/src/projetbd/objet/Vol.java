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
public class Vol {
    private int idVol;
    private String villeD;
    private String villeA;
    private int heureD;
    private int heureA;
    private double duree;
    private int distance;
    private Avion avion;

    public Vol(int idVol, String villeD, String villeA, int heureD, int heureA, double duree, int distance, Avion avion) {
        this.idVol = idVol;
        this.villeD = villeD;
        this.villeA = villeA;
        this.heureD = heureD;
        this.heureA = heureA;
        this.duree = duree;
        this.distance = distance;
        this.avion = avion;
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

    public void setDuree(double duree) {
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
    
    
}

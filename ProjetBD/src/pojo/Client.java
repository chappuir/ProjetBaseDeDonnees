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
public class Client {
    private int idClient;
    private String nom;
    private String prenom;
    private String numero_adr;
    private String rue_adr;
    private String codeP_adr;
    private String ville;
    private String pays;
    private String noPasseport;
    private int heuresVol;
    private int ptsFidelite;
    private int reductionImm;

    public Client(int idClient, String nom, String prenom, String numero_adr, String rue_adr, String codeP_adr, String ville, String pays, String noPasseport, int heuresVol, int ptsFidelite, int reductionImm) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.numero_adr = numero_adr;
        this.rue_adr = rue_adr;
        this.codeP_adr = codeP_adr;
        this.ville = ville;
        this.pays = pays;
        this.noPasseport = noPasseport;
        this.heuresVol = 0;
        this.ptsFidelite = 0;
        this.reductionImm = reductionImm;
    }
    
    public Client(){};

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumero_adr() {
        return numero_adr;
    }

    public void setNumero_adr(String numero_adr) {
        this.numero_adr = numero_adr;
    }

    public String getRue_adr() {
        return rue_adr;
    }

    public void setRue_adr(String rue_adr) {
        this.rue_adr = rue_adr;
    }

    public String getCodeP_adr() {
        return codeP_adr;
    }

    public void setCodeP_adr(String codeP_adr) {
        this.codeP_adr = codeP_adr;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getNoPasseport() {
        return noPasseport;
    }

    public void setNoPasseport(String noPasseport) {
        this.noPasseport = noPasseport;
    }

    public int getHeuresVol() {
        return heuresVol;
    }

    public void setHeuresVol(int heuresVol) {
        this.heuresVol = heuresVol;
    }

    public int getPtsFidelite() {
        return ptsFidelite;
    }

    public void setPtsFidelite(int ptsFidelite) {
        this.ptsFidelite = ptsFidelite;
    }

    public int getReductionImm() {
        return reductionImm;
    }

    public void setReductionImm(int reductionImm) {
        this.reductionImm = reductionImm;
    }
    
    

    
    
}

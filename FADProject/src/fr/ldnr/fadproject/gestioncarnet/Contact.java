/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.gestioncarnet;

import java.util.List;

/**
 *
 * @author Ains
 */
public class Contact {
    
    // Informations Contact 
    private String nom;
    private String prenom;
    private List<String> adresseMail; 
    private List<String> numTelephone;
    private String adressePostale;
    private int codePostal;
    private String ville; 
    
     
    
    public Contact(String n, String p, String ap, int cp, String v) {
        
        this.nom = n;
        this.prenom= p;
        this.adressePostale = ap;
        this.codePostal=cp;
        this.ville=v;
	
    }
    
    /**
     *
     * @return
     */
   
    public String toString() {
        return ("nom: " + this.nom + " prenom: "+this.prenom);
        
    }
    
    
    //getter / Setter
    public void setNom(String n) {
        nom = n;
    }
    public String getNom() {
        return nom;
    }
   
    
    public void setPrenom(String pn) {
        prenom = pn;
    }
    public String getPrenom() {
        return prenom;
    }
    
    
    public void setAdresseP(String ap) {
        this.adressePostale = ap;
    }
    public String getAdresseP() {
        return adressePostale;
    }
    
    
    public void setCodeP(int cp) {
        this.codePostal = cp;
    }
    public int getCodeP() {
        return codePostal;
    }
    
    
    public void setVille(String v){
        this.ville= v; 
    }
    public String getVille(){
        return ville; 
    }
   
    
    
    
    
    
    
    
    
           
    
    
    
    
    
    
    
    
    
}





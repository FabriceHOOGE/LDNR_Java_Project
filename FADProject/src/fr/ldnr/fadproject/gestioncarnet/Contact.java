/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.gestioncarnet;

import java.io.Serializable;

/**
 *
 * @author Ains
 */
public class Contact implements Serializable
{
    
    //---------------------Variables Membres
    private String nom;
    private String prenom;
    private String adresseMailPerso;
    private String adresseMailPro;
    private String numTelephoneDom;
    private String numTelephoneBur;
    private String numTelephoneMob;
    private String adressePostale;
    private String codePostal;
    private String ville;
    
    
    //---------------------Constructeur
    /**
     * 
     * @param nom : représente le nom du contact. Pour qu'un contact soit valide le nom est la données minimale à avoir.
     */
    public Contact(String nom)
    {
        this.setNom(nom);
    }
    
    
    //---------------------Accesseur
    public String getNom()
    {
        return this.nom;
    }
    
    public String getPrenom()
    {
        return this.prenom;
    }
    
    public String getAdresseMailPerso()
    {
        return this.adresseMailPerso;
    }
    
    public String getAdresseMailPro()
    {
        return this.adresseMailPro;
    }
    
    public String getTelephoneDom()
    {
        return this.numTelephoneDom;
    }
    
    public String getTelephoneBur()
    {
        return this.numTelephoneBur;
    }
        
    public String getTelephoneMob()
    {
        return this.numTelephoneMob;
    }
    
    public String getAdressePostale()
    {
        return this.adressePostale;
    }
    
    public String getcodePostal()
    {
        return this.codePostal;
    }
    
    public String getVille()
    {
        return this.ville;
    }
    
    
    //---------------------Mutateur
    public void setNom(String newNom)
    {
        this.nom = newNom;
    }
    
    public void setPrenom(String newPrenom)
    {
        this.prenom = newPrenom;
    }
    
    public void setAdresseMailPro(String newAdresseMail)
    {
        this.adresseMailPro = newAdresseMail;
    }
    
    public void setAdresseMailPerso(String newAdresseMail)
    {
        this.adresseMailPerso = newAdresseMail;
    }
    
    public void setTelephoneDom(String newTelephone)
    {
        this.numTelephoneDom = newTelephone;
    }
    
    public void setTelephoneBur(String newTelephone)
    {
        this.numTelephoneBur = newTelephone;
    }
    
    public void setTelephoneMob(String newTelephone)
    {
        this.numTelephoneMob = newTelephone;
    }
    
    public void setAdressePostale(String newAdressePostale)
    {
        this.adressePostale = newAdressePostale;
    }
    
    public void setCodePostal(String newCodePostal)
    {
        this.codePostal = newCodePostal;
    }
    
    public void setVille(String newVille)
    {
        this.ville = newVille;
    }
    
    //---------------------Méthode
    /**
     * 
     * @return une chaine de caractère représentant l'objet 
     */
    @Override
    public String toString()
    {
        return ("========================================\n" + "nom: " + this.nom + "||" + " prenom: " + this.prenom + "\n" + " adresse mail perso:" + this.adresseMailPerso + "||" + "adresse mail pro: " + this.adresseMailPro + "\n" + " téléphone bureau: " + this.numTelephoneBur + "||" + "téléphone domicile: " + this.numTelephoneDom + "||" + "téléphone mobile: " + this.numTelephoneMob + "\n" + " adresse postale: " + this.adressePostale + "||" + "code postal: " + this.codePostal + "||" + "ville: " + this.ville + "\n");
    }
}
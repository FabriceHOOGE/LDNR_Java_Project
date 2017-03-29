/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.gestioncarnet;

import fr.ldnr.fadproject.sauvegarde.SourceDB;
import fr.ldnr.fadproject.sauvegarde.SourceFichier;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ains
 */
public class GestionContact
{
    //---------------------Variables Membres
    /**
     * lContact : Liste contenant tous les contacts
     */
    private List<Contact> lContact;
    
    /**
     * objet de connexion à la source de données pour sauvegarder et recupérer la liste de contact.
     */
    private SourceDB sourceDB;
    
    
    //---------------------Constructeur
    
    /**
     * construceur de la liste de contact.
     * le constructeur utilise la source de données pour récupérer les données sauvegardées.
     */
    public GestionContact()
    {
        this.sourceDB = new SourceFichier(); 
        this.lContact = sourceDB.recupererContact();
    }
    
    //---------------------Accesseurs
    /**
     * 
     * @return renvoi la liste des contacts atuellement en mémoire
     */
    public List<Contact> getContact()
    {
        return this.lContact;
    }
    
    
    
    //---------------------Méthodes
    /**
     * permet d'ajouter un nouveau contact au carnet d'adresse.
     * @param newContact : le nouveau contact à rajouter dans le carnet d'adresse
     */
    public void ajouterContact(Contact newContact)
    {
        lContact.add(newContact);
    }
    
    /**
     * permet de rechercher les contacts en fonction du nom.
     * @param nomRechercher : représente le nom recherché par l'utilisateur
     * @return : une liste de tous les contacts correspondant à la recherche
     */
    public List<Contact> rechercherContact(String nomRechercher)
    {
        List<Contact> Resultat = new ArrayList();
        for(Contact current : this.lContact)
        {
            if(current.getNom().equals(nomRechercher))
            {
                Resultat.add(current);
            }
        }
        return Resultat;
    }
    
    /**
     * Cette fonction permet de demander la sauvegarde des contacts présent dans la liste.
     */
    public void sauverListContact()
    {
        this.sourceDB.sauverContact(this.lContact);
    }
    
    /**
     * Cette fonction permet de supprimer un contact de la liste des contacts
     * Elle sera implémentée plus tard apres une premiere version de l'application.
     */
    public static void supprimerContact()
    {
        
    }
    
    /**
     * Cette fonction permettra de modifier un client présent dans la liste.
     * Elle sera implémentée plus tard apres une premiere version de l'application.
     */
    public void modifierContact()
    {
        
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.gestioncarnet;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ains
 */
public class GestionContact {
    
    
  public GestionContact() {
    }

    /**
     * 
     */
    private List lContact;

    
    
    /**
     * 
     * @param newContact
     */
    public void ajouterContact(Contact newContact) {
        
        List <Contact> lContact = new ArrayList();  
        lContact.add(newContact);  
        Contact i = lContact.get(0);
    }

    /**
     * 
     * @return 
     */
    /*public List<Contact> rechercherContact(String nom) {
        
        for (int i=0;i<this.lContact.size(); i++) {
        
            if (nom=this.lContact.get(i).)
            
        } else {
                
                
                }
                
                
      return null;
    }*/

    
    /**
     * 
     */
    public void modifierContact() {
        
        
    }

    /**
     * 
     */
    public static void supprimerContact() {
        
    }

    
}

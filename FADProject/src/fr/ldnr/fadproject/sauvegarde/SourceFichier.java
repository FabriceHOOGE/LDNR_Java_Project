/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.sauvegarde;

import fr.ldnr.fadproject.gestioncarnet.Contact;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabri
 */
public class SourceFichier implements SourceDB
{
    private final String saveFilePath = ".\\saveContacts";

    
    public SourceFichier()
    {
        
    }
    
    /**
     * 
     * @param lContact : représente une liste de contact qui doivent être sauvegardé dans le fichier.
     */
    @Override
    public void sauverContact(List<Contact> lContact)
    {
        ObjectOutputStream out = null;
        try
        {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(this.saveFilePath))));
            for(Contact current : lContact)
            {
                out.writeObject(current);
            }            
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(SourceFichier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(SourceFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                if(out != null)
                {
                    out.close();
                }
            }catch(IOException e)
            {
            }
        }
    }

    /**
     * Cette fonction désérialise les objets Contact contenu dans le fichier pour les ajouter dans une liste.
     * Cette liste est ensuite renvoyée en retour de la fonction.
     * @return : renvoi une liste des contacts présent dans le fichier de sauvegarde.
     */
    @Override
    public List<Contact> recupererContact()
    {
        
        //Declaration des variables nécessaires
        List<Contact> lContact = new ArrayList();
        ObjectInputStream in = null;
        Contact i;
        File f = new File(this.saveFilePath);

        try
        {
            if(f.exists())
            {
                in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));

                do
                {
                    i = (Contact)in.readObject();
                    lContact.add(i);
                }while(i != null); 
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Le fichier de sauvegarde n'existe pas.");
        } catch (IOException | ClassNotFoundException ex)
        {
           System.out.println("Il n'y a plus de contacts à lire dans le fichier de sauvegarde.");
        }finally
        {
            try
            {
                if(in !=null)
                {
                    in.close();
                }
            } catch (IOException ex)
            {
                Logger.getLogger(SourceFichier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lContact;
    }
}

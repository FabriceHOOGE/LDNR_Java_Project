/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.iu;

import javax.swing.JFrame;

/**
 *
 * @author fabri
 */
public class FADFrame extends JFrame
{
    //-----------------------Variables Membres
    
    
    //-----------------------Constructeurs
    public FADFrame()
    {
        //Titre de la fnetre
        this.setTitle("FAD - Carnet d'adresse");
        //Taille de la fenetre
        this.setSize(640, 480);
        //a revoir pour que lors de la fermeture une sauvegarde des contact soit effectuée
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Emplacement par défaut de la fenetre(au centre)
        this.setLocationRelativeTo(null);
        
        //Ajout d'un JPanel a la fenetre. C'est ce JPanel qui affichera nos éléments.
        this.setContentPane(new FADPanelAccueil());
        
        
        //Création et ajout de la barre de menu dans la fenetre
        this.setJMenuBar(new FADMenuBar());
        
        
        //On demande l'affichage de la fenetre
        this.setVisible(true);
    }
    
    
    //-----------------------Méthodes
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.iu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author fabri
 */
public class FADMenuBar extends JMenuBar
{
    public FADMenuBar()
    {
        //Création des boutons du menu Fichier
        JMenu jmFichier = new JMenu("Fichier");
        JMenuItem jmiNouveau = new JMenuItem("Nouveau");
        JMenuItem jmiSauvegarder = new JMenuItem("Sauvegarder");
        JMenuItem jmiQuitter = new JMenuItem("Quitter");
        
        //Ajout des boutons au menu Fichier
        jmFichier.add(jmiNouveau);
        jmFichier.add(jmiSauvegarder);
        jmFichier.add(jmiQuitter);
        
        //Ajout du menu Fichier à la barre de menu
        this.add(new JMenuBar());
        this.setVisible(true);
    }
}

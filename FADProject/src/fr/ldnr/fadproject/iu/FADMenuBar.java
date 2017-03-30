/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.iu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author fabri
 */
public class FADMenuBar extends JMenuBar implements MouseListener
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
        this.add(jmFichier);
        this.setVisible(true);
        
        //Gestion évenementielle
        jmiQuitter.addMouseListener(this);
        jmiNouveau.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me)
    {
        System.out.println("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent me)
    {
        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent me)
    {
        System.out.println("mouseReleased");
        System.exit(0);
    }

    @Override
    public void mouseEntered(MouseEvent me)
    {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent me)
    {
        System.out.println("mouseExited");
    }
}

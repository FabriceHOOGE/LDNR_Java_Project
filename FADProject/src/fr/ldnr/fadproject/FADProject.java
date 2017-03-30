/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject;

import fr.ldnr.fadproject.iu.Console;
import fr.ldnr.fadproject.iu.FADFrame;
import java.util.Scanner;

/**
 *
 * @author Ains
 */
public class FADProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        System.out.println("Bienvenue dans votre Gestionnaire de Contacts.");
        System.out.println("----------------------------------------------");
        char mode = ' ';
        Scanner sc = new Scanner(System.in);
        
        do{ //tant que reponse n'est pas 1 ou 2 
            System.out.println("Veuillez choisir votre mode : ");
            System.out.println("1 - Console");
            System.out.println("2 - Graphique");
            System.out.println("3 - Exit");
            mode = sc.nextLine().charAt(0);
       
            if(mode != '1' && mode != '2' && mode != '3')
                System.out.println("Choix inconnu, veuillez réitérer votre choix.");
        }while (mode != '1' && mode != '2' && mode != '3');
     
        //Selon le mode choisi
        switch (mode) {
            case '1':
                Console cs = new Console();
                cs.consoleStart();
                break;
            case '2':
                System.out.println("Mode Graphique en Cours de création.");
                new FADFrame();
                break;
            case '3':
                System.out.println("Au-Revoir et A Bientôt");
                sc.close();
                break;
            default:
                System.out.println("Au-Revoir et A Bientôt");
                sc.close();
                break;
        }
    }  
}

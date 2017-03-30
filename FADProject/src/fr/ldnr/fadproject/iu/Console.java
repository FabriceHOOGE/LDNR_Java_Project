/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.iu;
import fr.ldnr.fadproject.gestioncarnet.Contact;
import java.util.Scanner;
import fr.ldnr.fadproject.gestioncarnet.GestionContact;
import java.util.List;

/**
 *
 * @author dfour
 */
public class Console {
    private char mode = ' ';
        
    public Console(){
    /**
     *
     */
    this.mode = mode;
    }
    public char consoleStart(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenue dans votre Gestionnaire de Contacts.");
            System.out.println("----------------------------------------------");

            do{//tant que reponse n'est pas 1, 2 ou 3
                mode = ' ';
                System.out.println("Vous pouvez à présent : ");
                System.out.println("1 - Rechercher");
                System.out.println("2 - Ajouter");
                System.out.println("3 - Exit");
                mode = sc.nextLine().charAt(0);
       
                if(mode != '1' && mode != '2' && mode != '3')
                System.out.println("Choix inconnu, veuillez réitérer votre choix.");

            }while (mode != '1' && mode != '2' && mode != '3');
     
        //Selon le choix, on lance la recherche ou l'ajout
        switch (mode) {
            case '1':
                {
                    Scanner sc1 = new Scanner(System.in);
                    String nom;
                    System.out.println("Veuillez saisir un Nom :");
                    nom = sc1.nextLine();
                    GestionContact gc = new GestionContact();
                    List<Contact> resultat = gc.rechercherContact(nom);
                    for(int i=0; i<resultat.size(); i++)
                        System.out.println(i);
                    break;
                }
            case '2':
                {
                    //récupération des infos du contact
                    System.out.println("Veuillez saisir le Nom de votre nouveau contact :");
                    Scanner scNom = new Scanner(System.in);
                    String nom = scNom.nextLine();
                    
                    System.out.println("Veuillez saisir le Prénom :");
                    Scanner scPrenom = new Scanner(System.in);
                    String prenom = scPrenom.nextLine();
                    
                    System.out.println("Veuillez saisir l'adresse mail personnel :");
                    Scanner scAdrMailPerso = new Scanner(System.in);
                    String adrMailPerso = scAdrMailPerso.nextLine();
                    
                    System.out.println("Veuillez saisir l'adresse mail professionnel :");
                    Scanner scAdrMailPro = new Scanner(System.in);
                    String adrMailPro = scAdrMailPro.nextLine();
                    
                    System.out.println("Veuillez saisir le numéro de téléphone du domicile :");
                    Scanner scTelDom = new Scanner(System.in);
                    String telDom = scTelDom.nextLine();
                    
                    System.out.println("Veuillez saisir le numéro de téléphone professionnel :");
                    Scanner scTelBur = new Scanner(System.in);
                    String telBur = scTelBur.nextLine();
                    
                    System.out.println("Veuillez saisir le numéro de téléphone mobile :");
                    Scanner scTelMob = new Scanner(System.in);
                    String telMob = scTelMob.nextLine();
                    
                    System.out.println("Veuillez saisir l'adresse postale :");
                    Scanner scAdrPost = new Scanner(System.in);
                    String adrPost = scAdrPost.nextLine();
                    
                    System.out.println("Veuillez saisir le code postal :");
                    Scanner scCodPost = new Scanner(System.in);
                    String codPost = scCodPost.nextLine();
                    
                    System.out.println("Veuillez saisir pour finir sa ville :");
                    Scanner scVille = new Scanner(System.in);
                    String ville = scVille.nextLine();
                    
                    //création de l'objet contact
                    Contact nouveauContact = new Contact(nom);
                    nouveauContact.setPrenom(prenom);
                    nouveauContact.setAdresseMailPerso(adrMailPerso);
                    nouveauContact.setAdresseMailPro(adrMailPro);
                    nouveauContact.setTelephoneDom(telDom);
                    nouveauContact.setTelephoneBur(telBur);
                    nouveauContact.setTelephoneMob(telMob);
                    nouveauContact.setAdressePostale(adrPost);
                    nouveauContact.setCodePostal(codPost);
                    nouveauContact.setVille(ville);
                    
                    nouveauContact.toString();
                    
                    //ajout de l'objet contact à la liste de contacts
                    
                    GestionContact gcajout = new GestionContact();
                    gcajout.ajouterContact(nouveauContact);
                    System.out.println("Contact Bien Ajouté");
                    break;
                }
            default:
                System.out.println("Au-Revoir et A Bientôt");
                sc.close();
                break;
        }
        return mode;
    }
}

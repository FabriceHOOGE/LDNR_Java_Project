/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.sauvegarde;

import fr.ldnr.fadproject.gestioncarnet.Contact;
import java.util.List;

/**
 *
 * @author fabri
 */
public interface SourceDB
{
    public void sauverContact(List<Contact> lContact);
    public List<Contact> recupererContact();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.gestioncarnet;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabri
 */
public class GestionContactTest
{
    
    public GestionContactTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getContact method, of class GestionContact.
     */
    @Test
    public void testGetContact()
    {
        System.out.println("getContact");
        GestionContact instance = new GestionContact();
        List<Contact> expResult = null;
        List<Contact> result = instance.getContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterContact method, of class GestionContact.
     */
    @Test
    public void testAjouterContact()
    {
        System.out.println("ajouterContact");
        Contact newContact = new Contact("Test");
        GestionContact instance = new GestionContact();
        instance.ajouterContact(newContact);
        instance.rechercherContact("Test");
        assertNotNull(instance.rechercherContact("Test"));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of rechercherContact method, of class GestionContact.
     */
    @Test
    public void testRechercherContact()
    {
        System.out.println("rechercherContact");
        String nomRechercher = "Test";
        GestionContact instance = new GestionContact();
        Contact c1 = new Contact("Test");
        Contact c2 = new Contact("Test1");
        Contact c3 = new Contact("Test");
        instance.ajouterContact(c1);
        instance.ajouterContact(c2);
        instance.ajouterContact(c3);
        List<Contact> expResult = new ArrayList();
        expResult.add(c1);
        expResult.add(c3);
        List<Contact> result = instance.rechercherContact(nomRechercher);
        for(Contact current : result)
        {
            System.out.println(current);
        }
        for(Contact current : expResult)
        {
            System.out.println(current);
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sauverListContact method, of class GestionContact.
     */
    @Test
    public void testSauverListContact()
    {
        System.out.println("sauverListContact");
        GestionContact instance = new GestionContact();
        instance.sauverListContact();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of supprimerContact method, of class GestionContact.
     */
    @Test
    public void testSupprimerContact()
    {
        System.out.println("supprimerContact");
        GestionContact.supprimerContact();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of modifierContact method, of class GestionContact.
     */
    @Test
    public void testModifierContact()
    {
        System.out.println("modifierContact");
        GestionContact instance = new GestionContact();
        instance.modifierContact();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }
    
}

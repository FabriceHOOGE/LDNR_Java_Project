/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.sauvegarde;

import fr.ldnr.fadproject.gestioncarnet.Contact;
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
public class SourceFichierTest
{
    
    public SourceFichierTest()
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
     * Test of sauverContact method, of class SourceFichier.
     */
    @Test
    public void testSauverContact()
    {
        System.out.println("sauverContact");
        List<Contact> lContact = null;
        SourceFichier instance = new SourceFichier();
        instance.sauverContact(lContact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recupererContact method, of class SourceFichier.
     */
    @Test
    public void testRecupererContact()
    {
        System.out.println("recupererContact");
        SourceFichier instance = new SourceFichier();
        List<Contact> expResult = null;
        List<Contact> result = instance.recupererContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

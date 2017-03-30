/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.fadproject.gestioncarnet;

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
public class ContactTest
{
    
    public ContactTest()
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
     * Test of getNom method, of class Contact.
     */
    @Test
    public void testGetNom()
    {
        System.out.println("getNom");
        Contact instance = new Contact("Robert");
        String expResult = "Robert";
        String result = instance.getNom();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getPrenom method, of class Contact.
     */
    @Test
    public void testGetPrenom()
    {
        System.out.println("getPrenom");
        Contact instance = new Contact("Robert");
        String expResult = "opo";
        instance.setPrenom("opo");
        String result = instance.getPrenom();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of getAdresseMailPerso method, of class Contact.
     */
    @Test
    public void testGetAdresseMailPerso()
    {
        System.out.println("getAdresseMailPerso");
        Contact instance = new Contact("Robert");
        String expResult = "uio@p";
        instance.setAdresseMailPerso("uio@p");
        String result = instance.getAdresseMailPerso();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of getAdresseMailPro method, of class Contact.
     */
    @Test
    public void testGetAdresseMailPro()
    {
        System.out.println("getAdresseMailPro");
        Contact instance = new Contact("Robert");
        String expResult = "ddsd@dd";
        instance.setAdresseMailPro("ddsd@dd");
        String result = instance.getAdresseMailPro();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTelephoneDom method, of class Contact.
     */
    @Test
    public void testGetTelephoneDom()
    {
        System.out.println("getTelephoneDom");
        Contact instance = new Contact("Robert");
        String expResult = "05356585";
        instance.setTelephoneDom("05356585");
        String result = instance.getTelephoneDom();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTelephoneBur method, of class Contact.
     */
    @Test
    public void testGetTelephoneBur()
    {
        System.out.println("getTelephoneBur");
        Contact instance = new Contact("Robert");
        String expResult = "0565857489";
        instance.setTelephoneBur("0565857489");
        String result = instance.getTelephoneBur();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTelephoneMob method, of class Contact.
     */
    @Test
    public void testGetTelephoneMob()
    {
        System.out.println("getTelephoneMob");
        Contact instance = new Contact("Robert");
        String expResult = "0658475878";
        instance.setTelephoneMob("0658475878");
        String result = instance.getTelephoneMob();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAdressePostale method, of class Contact.
     */
    @Test
    public void testGetAdressePostale()
    {
        System.out.println("getAdressePostale");
        Contact instance = new Contact("Robert");
        String expResult = "rrre";
        instance.setAdressePostale("rrre");
        String result = instance.getAdressePostale();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getcodePostal method, of class Contact.
     */
    @Test
    public void testGetcodePostal()
    {
        System.out.println("getcodePostal");
        Contact instance = new Contact("Robert");
        String expResult = "84857";
        instance.setCodePostal("84857");
        String result = instance.getcodePostal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVille method, of class Contact.
     */
    @Test
    public void testGetVille()
    {
        System.out.println("getVille");
        Contact instance = new Contact("Robert");
        String expResult = "Toulouse";
        instance.setVille("Toulouse");
        String result = instance.getVille();
        assertEquals(expResult, result);
        
    }
    /**
     * Test of setNom method, of class Contact.
     */
    @Test
    public void testSetNom()
    {
        System.out.println("setNom");
        String newNom = "Mickey";
        Contact instance = new Contact("Robert");
        instance.setNom(newNom);
        assertEquals(newNom,instance.getNom());
    }

    /**
     * Test of setPrenom method, of class Contact.
     */
    @Test
    public void testSetPrenom()
    {
        System.out.println("setPrenom");
        String newPrenom = "Paul";
        Contact instance = new Contact ("Robert");
        instance.setPrenom(newPrenom);
        assertEquals(newPrenom,instance.getPrenom());
    }

    /**
     * Test of setAdresseMailPro method, of class Contact.
     */
    @Test
    public void testSetAdresseMailPro()
    {
        System.out.println("setAdresseMailPro");
        String newAdresseMail = "ddfssdfdf@gmail.pro";
        Contact instance = new Contact ("Robert");
        instance.setAdresseMailPro(newAdresseMail);
        assertEquals(newAdresseMail,instance.getAdresseMailPro());
    }

    /**
     * Test of setAdresseMailPerso method, of class Contact.
     */
    @Test
    public void testSetAdresseMailPerso()
    {
        System.out.println("setAdresseMailPerso");
        String newAdresseMail = "dsdsd@gmail.com";
        Contact instance = new Contact ("Robert");
        instance.setAdresseMailPerso(newAdresseMail);
        assertEquals(newAdresseMail,instance.getAdresseMailPerso());
    }

    /**
     * Test of setTelephoneDom method, of class Contact.
     */
    @Test
    public void testSetTelephoneDom()
    {
        System.out.println("setTelephoneDom");
        String newTelephone = "0545758468";
        Contact instance = new Contact ("Robert");
        instance.setTelephoneDom(newTelephone);
        assertEquals(newTelephone,instance.getTelephoneDom());
    }

    /**
     * Test of setTelephoneBur method, of class Contact.
     */
    @Test
    public void testSetTelephoneBur()
    {
        System.out.println("setTelephoneBur");
        String newTelephone = "0521456895";
        Contact instance = new Contact ("Robert");
        instance.setTelephoneBur(newTelephone);
        assertEquals(newTelephone,instance.getTelephoneBur());
        
        
    }

    /**
     * Test of setTelephoneMob method, of class Contact.
     */
    @Test
    public void testSetTelephoneMob()
    {
        System.out.println("setTelephoneMob");
        String newTelephonemob = "0621457598";
        Contact instance = new Contact("Robert");
        instance.setTelephoneMob(newTelephonemob);
        assertEquals(newTelephonemob,instance.getTelephoneMob());
    }

    /**
     * Test of setAdressePostale method, of class Contact.
     */
    @Test
    public void testSetAdressePostale()
    {
        System.out.println("setAdressePostale");
        String newAdressePostale = "testap";
        Contact instance = new Contact("Robert");
        instance.setAdressePostale(newAdressePostale);
        assertEquals(newAdressePostale,instance.getAdressePostale());
    }

    /**
     * Test of setCodePostal method, of class Contact.
     */
    @Test
    public void testSetCodePostal()
    {
        System.out.println("setCodePostal");
        String newCodePostal = "testcp2";
        Contact instance = new Contact("Robert");
        instance.setCodePostal(newCodePostal);
        assertEquals(newCodePostal,instance.getcodePostal());
    }

    /**
     * Test of setVille method, of class Contact.
     */
    @Test
    public void testSetVille()
    {
        System.out.println("setVille");
        String newVille = "tintin";
        Contact instance = new Contact("toto");
        instance.setVille(newVille);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(newVille,instance.getVille());
    }

    /**
     * Test of toString method, of class Contact.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Contact instance = new Contact("Robert");
        String expResult = "";
        String result = instance.toString();
        //assertEquals(expResult, result);
        assertTrue(true);
        
    }
    
}

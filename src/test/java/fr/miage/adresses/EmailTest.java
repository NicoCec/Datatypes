/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.adresses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author E12B336Z
 */
public class EmailTest {
    
    public EmailTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMyNomDomaine method, of class Email.
     */
    @Test
    public void testGetMyNomDomaine() {
        System.out.println("getMyNomDomaine");
        Email instance = null;
        NomDomaine expResult = null;
        NomDomaine result = instance.getMyNomDomaine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyNomDomaine method, of class Email.
     */
    @Test
    public void testSetMyNomDomaine() {
        System.out.println("setMyNomDomaine");
        NomDomaine myNomDomaine = null;
        Email instance = null;
        instance.setMyNomDomaine(myNomDomaine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyNomUtilisateur method, of class Email.
     */
    @Test
    public void testGetMyNomUtilisateur() {
        System.out.println("getMyNomUtilisateur");
        Email instance = null;
        NomUtilisateur expResult = null;
        NomUtilisateur result = instance.getMyNomUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyNomUtilisateur method, of class Email.
     */
    @Test
    public void testSetMyNomUtilisateur() {
        System.out.println("setMyNomUtilisateur");
        NomUtilisateur myNomUtilisateur = null;
        Email instance = null;
        instance.setMyNomUtilisateur(myNomUtilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Email.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Email instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

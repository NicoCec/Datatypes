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
public class NomUtilisateurTest {
    
    public NomUtilisateurTest() {
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
     * Test of getAdresseU method, of class NomUtilisateur.
     */
    @Test
    public void testGetAdresseU() {
        System.out.println("getAdresseU");
        NomUtilisateur instance = null;
        String expResult = "";
        String result = instance.getAdresseU();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdresseU method, of class NomUtilisateur.
     */
    @Test
    public void testSetAdresseU() {
        System.out.println("setAdresseU");
        String adresseU = "";
        NomUtilisateur instance = null;
        instance.setAdresseU(adresseU);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

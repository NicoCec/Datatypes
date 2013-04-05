/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.adresses;

import java.util.List;
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
public class PaysAdresseTest {
    
    public PaysAdresseTest() {
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
     * Test of addVille method, of class PaysAdresse.
     */
    @Test
    public void testAddVille() {
        System.out.println("addVille");
        Ville ville = null;
        PaysAdresse instance = null;
        instance.addVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delVille method, of class PaysAdresse.
     */
    @Test
    public void testDelVille() {
        System.out.println("delVille");
        Ville ville = null;
        PaysAdresse instance = null;
        instance.delVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomP method, of class PaysAdresse.
     */
    @Test
    public void testGetNomP() {
        System.out.println("getNomP");
        PaysAdresse instance = null;
        String expResult = "";
        String result = instance.getNomP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomP method, of class PaysAdresse.
     */
    @Test
    public void testSetNomP() {
        System.out.println("setNomP");
        String nomP = "";
        PaysAdresse instance = null;
        instance.setNomP(nomP);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVilles method, of class PaysAdresse.
     */
    @Test
    public void testGetVilles() {
        System.out.println("getVilles");
        PaysAdresse instance = null;
        List expResult = null;
        List result = instance.getVilles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVilles method, of class PaysAdresse.
     */
    @Test
    public void testSetVilles() {
        System.out.println("setVilles");
        List<Ville> villes = null;
        PaysAdresse instance = null;
        instance.setVilles(villes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

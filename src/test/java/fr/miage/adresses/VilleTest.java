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
public class VilleTest {
    
    public VilleTest() {
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
     * Test of getNomV method, of class Ville.
     */
    @Test
    public void testGetNomV() {
        System.out.println("getNomV");
        Ville instance = null;
        String expResult = "";
        String result = instance.getNomV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomV method, of class Ville.
     */
    @Test
    public void testSetNomV() {
        System.out.println("setNomV");
        String nomV = "";
        Ville instance = null;
        instance.setNomV(nomV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLieux method, of class Ville.
     */
    @Test
    public void testGetLieux() {
        System.out.println("getLieux");
        Ville instance = null;
        List expResult = null;
        List result = instance.getLieux();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLieux method, of class Ville.
     */
    @Test
    public void testSetLieux() {
        System.out.println("setLieux");
        List<Lieux> lieux = null;
        Ville instance = null;
        instance.setLieux(lieux);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLieu method, of class Ville.
     */
    @Test
    public void testAddLieu() {
        System.out.println("addLieu");
        Lieux lieu = null;
        Ville instance = null;
        instance.addLieu(lieu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delLieu method, of class Ville.
     */
    @Test
    public void testDelLieu() {
        System.out.println("delLieu");
        Lieux lieu = null;
        Ville instance = null;
        instance.delLieu(lieu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

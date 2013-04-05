/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.mesures;

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
public class QuantiteTest {
    
    public QuantiteTest() {
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
     * Test of getUnite method, of class Quantite.
     */
    @Test
    public void testGetUnite() {
        System.out.println("getUnite");
        Quantite instance = null;
        Unite expResult = null;
        Unite result = instance.getUnite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnite method, of class Quantite.
     */
    @Test
    public void testSetUnite() {
        System.out.println("setUnite");
        Unite unite = null;
        Quantite instance = null;
        instance.setUnite(unite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyValeur method, of class Quantite.
     */
    @Test
    public void testGetMyValeur() {
        System.out.println("getMyValeur");
        Quantite instance = null;
        int expResult = 0;
        int result = instance.getMyValeur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyValeur method, of class Quantite.
     */
    @Test
    public void testSetMyValeur() {
        System.out.println("setMyValeur");
        int myValeur = 0;
        Quantite instance = null;
        instance.setMyValeur(myValeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertir method, of class Quantite.
     */
    @Test
    public void testConvertir() {
        System.out.println("convertir");
        Unite uniteArr = null;
        FacteurConversion facteurConv = null;
        Quantite instance = null;
        Conversion expResult = null;
        Conversion result = instance.convertir(uniteArr, facteurConv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

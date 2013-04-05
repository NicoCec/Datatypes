/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.financier;

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
public class TauxDeConversionTest {
    
    public TauxDeConversionTest() {
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
     * Test of getTaux method, of class TauxDeConversion.
     */
    @Test
    public void testGetTaux() {
        System.out.println("getTaux");
        TauxDeConversion instance = null;
        double expResult = 0.0;
        double result = instance.getTaux();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaux method, of class TauxDeConversion.
     */
    @Test
    public void testSetTaux() {
        System.out.println("setTaux");
        double taux = 0.0;
        TauxDeConversion instance = null;
        instance.setTaux(taux);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

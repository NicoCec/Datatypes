/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.financier;

import fr.miage.temporel.DateTempo;
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
public class ConversionTest {
    
    public ConversionTest() {
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
     * Test of getMontantDepart method, of class Conversion.
     */
    @Test
    public void testGetMontantDepart() {
        System.out.println("getMontantDepart");
        Conversion instance = null;
        double expResult = 0.0;
        double result = instance.getMontantDepart();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMontantDepart method, of class Conversion.
     */
    @Test
    public void testSetMontantDepart() {
        System.out.println("setMontantDepart");
        double montantDepart = 0.0;
        Conversion instance = null;
        instance.setMontantDepart(montantDepart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontantArrivee method, of class Conversion.
     */
    @Test
    public void testGetMontantArrivee() {
        System.out.println("getMontantArrivee");
        Conversion instance = null;
        double expResult = 0.0;
        double result = instance.getMontantArrivee();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMontantArrivee method, of class Conversion.
     */
    @Test
    public void testSetMontantArrivee() {
        System.out.println("setMontantArrivee");
        double montantArrivee = 0.0;
        Conversion instance = null;
        instance.setMontantArrivee(montantArrivee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviseDepart method, of class Conversion.
     */
    @Test
    public void testGetDeviseDepart() {
        System.out.println("getDeviseDepart");
        Conversion instance = null;
        Devise expResult = null;
        Devise result = instance.getDeviseDepart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeviseDepart method, of class Conversion.
     */
    @Test
    public void testSetDeviseDepart() {
        System.out.println("setDeviseDepart");
        Devise deviseDepart = null;
        Conversion instance = null;
        instance.setDeviseDepart(deviseDepart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviseArrivee method, of class Conversion.
     */
    @Test
    public void testGetDeviseArrivee() {
        System.out.println("getDeviseArrivee");
        Conversion instance = null;
        Devise expResult = null;
        Devise result = instance.getDeviseArrivee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeviseArrivee method, of class Conversion.
     */
    @Test
    public void testSetDeviseArrivee() {
        System.out.println("setDeviseArrivee");
        Devise deviseArrivee = null;
        Conversion instance = null;
        instance.setDeviseArrivee(deviseArrivee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateConv method, of class Conversion.
     */
    @Test
    public void testGetDateConv() {
        System.out.println("getDateConv");
        Conversion instance = null;
        DateTempo expResult = null;
        DateTempo result = instance.getDateConv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateConv method, of class Conversion.
     */
    @Test
    public void testSetDateConv() {
        System.out.println("setDateConv");
        DateTempo dateConv = null;
        Conversion instance = null;
        instance.setDateConv(dateConv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Conversion.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Conversion instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

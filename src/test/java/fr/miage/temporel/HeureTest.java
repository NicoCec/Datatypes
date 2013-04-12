/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 */

package fr.miage.temporel;

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
public class HeureTest {
    
    public HeureTest() {
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
     * Test of getHeureVar method, of class Heure.
     */
    @Test
    public void testGetHeureVar() {
        System.out.println("getHeureVar");
        Heure instance = null;
        int expResult = 0;
        int result = instance.getHeureVar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeureVar method, of class Heure.
     */
    @Test
    public void testSetHeureVar() {
        System.out.println("setHeureVar");
        int heureVar = 0;
        Heure instance = null;
        instance.setHeureVar(heureVar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinute method, of class Heure.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        Heure instance = null;
        int expResult = 0;
        int result = instance.getMinute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinute method, of class Heure.
     */
    @Test
    public void testSetMinute() {
        System.out.println("setMinute");
        int minute = 0;
        Heure instance = null;
        instance.setMinute(minute);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeconde method, of class Heure.
     */
    @Test
    public void testGetSeconde() {
        System.out.println("getSeconde");
        Heure instance = null;
        int expResult = 0;
        int result = instance.getSeconde();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeconde method, of class Heure.
     */
    @Test
    public void testSetSeconde() {
        System.out.println("setSeconde");
        int seconde = 0;
        Heure instance = null;
        instance.setSeconde(seconde);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Heure.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Heure instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

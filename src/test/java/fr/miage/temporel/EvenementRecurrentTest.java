/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
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
public class EvenementRecurrentTest {
    
    public EvenementRecurrentTest() {
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
     * Test of getMyType method, of class EvenementRecurrent.
     */
    @Test
    public void testGetMyType() {
        System.out.println("getMyType");
        EvenementRecurrent instance = null;
        TypeEvenementRecurrent expResult = null;
        TypeEvenementRecurrent result = instance.getMyType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyType method, of class EvenementRecurrent.
     */
    @Test
    public void testSetMyType() {
        System.out.println("setMyType");
        TypeEvenementRecurrent myType = null;
        EvenementRecurrent instance = null;
        instance.setMyType(myType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyNom method, of class EvenementRecurrent.
     */
    @Test
    public void testGetMyNom() {
        System.out.println("getMyNom");
        EvenementRecurrent instance = null;
        String expResult = "";
        String result = instance.getMyNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyNom method, of class EvenementRecurrent.
     */
    @Test
    public void testSetMyNom() {
        System.out.println("setMyNom");
        String myNom = "";
        EvenementRecurrent instance = null;
        instance.setMyNom(myNom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class EvenementRecurrent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EvenementRecurrent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
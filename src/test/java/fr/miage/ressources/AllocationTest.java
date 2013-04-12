/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 */

package fr.miage.ressources;

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
public class AllocationTest {
    
    public AllocationTest() {
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
     * Test of getType method, of class Allocation.
     */
    //@Test
    public void testGetType() {
        System.out.println("getType");
        Allocation instance = null;
        TypeRessource expResult = null;
        TypeRessource result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Allocation.
     */
    //@Test
    public void testSetType() {
        System.out.println("setType");
        TypeRessource type = null;
        Allocation instance = null;
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyName method, of class Allocation.
     */
    //@Test
    public void testGetMyName() {
        System.out.println("getMyName");
        Allocation instance = null;
        String expResult = "";
        String result = instance.getMyName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyName method, of class Allocation.
     */
    //@Test
    public void testSetMyName() {
        System.out.println("setMyName");
        String myName = "";
        Allocation instance = null;
        instance.setMyName(myName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Allocation.
     */
    //@Test
    public void testToString() {
        System.out.println("toString");
        Allocation instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

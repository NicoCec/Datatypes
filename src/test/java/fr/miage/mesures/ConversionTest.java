/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 * identifiant : ${git.commit.id}
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
public class ConversionTest {
    
    private Unite u1 = new Unite("kg");
    private Unite u2 = new Unite("g");
    private Conversion c1 = new Conversion(20, 10, u1, u2);
    private double myQuantiteDep;
    private double myQuantiteArr;
    
    
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
     * Test of getMyQuantiteDep method, of class Conversion.
     */
    //@Test
    /*public void testGetMyQuantiteDep() {
        System.out.println("getMyQuantiteDep");
        Conversion instance = null;
        double expResult = 0.0;
        double result = instance.getMyQuantiteDep();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setMyQuantiteDep method, of class Conversion.
     */
    //@Test
    /*public void testSetMyQuantiteDep() {
        System.out.println("setMyQuantiteDep");
        double myQuantiteDep = 0.0;
        Conversion instance = null;
        instance.setMyQuantiteDep(myQuantiteDep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getMyQuantiteArr method, of class Conversion.
     */
    //@Test
    /*public void testGetMyQuantiteArr() {
        System.out.println("getMyQuantiteArr");
        Conversion instance = null;
        double expResult = 0.0;
        double result = instance.getMyQuantiteArr();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setMyQuantiteArr method, of class Conversion.
     */
    //@Test
    /*public void testSetMyQuantiteArr() {
        System.out.println("setMyQuantiteArr");
        double myQuantiteArr = 0.0;
        Conversion instance = null;
        instance.setMyQuantiteArr(myQuantiteArr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getMyUniteDep method, of class Conversion.
     */
    //@Test
    /*public void testGetMyUniteDep() {
        System.out.println("getMyUniteDep");
        Conversion instance = null;
        Unite expResult = null;
        Unite result = instance.getMyUniteDep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setMyUniteDep method, of class Conversion.
     */
    //@Test
    /*public void testSetMyUniteDep() {
        System.out.println("setMyUniteDep");
        Unite myUniteDep = null;
        Conversion instance = null;
        instance.setMyUniteDep(myUniteDep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getMyUniteArr method, of class Conversion.
     */
    //@Test
    /*public void testGetMyUniteArr() {
        System.out.println("getMyUniteArr");
        Conversion instance = null;
        Unite expResult = null;
        Unite result = instance.getMyUniteArr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setMyUniteArr method, of class Conversion.
     */
    //@Test
    /*public void testSetMyUniteArr() {
        System.out.println("setMyUniteArr");
        Unite myUniteArr = null;
        Conversion instance = null;
        instance.setMyUniteArr(myUniteArr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of toString method, of class Conversion.
     */
    @Test
    public void testToString() {
        assertEquals(c1.toString(), "la conversion de 20.0 kg en g donne 10.0");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

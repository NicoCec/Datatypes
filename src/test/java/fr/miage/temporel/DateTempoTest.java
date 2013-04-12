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
public class DateTempoTest {
    
    public DateTempoTest() {
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
     * Test of getJour method, of class DateTempo.
     */
    //@Test
    public void testGetJour() {
        System.out.println("getJour");
        DateTempo instance = null;
        int expResult = 0;
        int result = instance.getJour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJour method, of class DateTempo.
     */
    //@Test
    public void testSetJour() {
        System.out.println("setJour");
        int jour = 0;
        DateTempo instance = null;
        instance.setJour(jour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMois method, of class DateTempo.
     */
    //@Test
    public void testGetMois() {
        System.out.println("getMois");
        DateTempo instance = null;
        int expResult = 0;
        int result = instance.getMois();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMois method, of class DateTempo.
     */
    //@Test
    public void testSetMois() {
        System.out.println("setMois");
        int mois = 0;
        DateTempo instance = null;
        instance.setMois(mois);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnee method, of class DateTempo.
     */
    //@Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        DateTempo instance = null;
        int expResult = 0;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnee method, of class DateTempo.
     */
    //@Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        int annee = 0;
        DateTempo instance = null;
        instance.setAnnee(annee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyHeure method, of class DateTempo.
     */
    //@Test
    public void testGetMyHeure() {
        System.out.println("getMyHeure");
        DateTempo instance = null;
        Heure expResult = null;
        Heure result = instance.getMyHeure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyHeure method, of class DateTempo.
     */
    //@Test
    public void testSetMyHeure() {
        System.out.println("setMyHeure");
        Heure myHeure = null;
        DateTempo instance = null;
        instance.setMyHeure(myHeure);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DateTempo.
     */
    //@Test
    public void testToString() {
        System.out.println("toString");
        DateTempo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

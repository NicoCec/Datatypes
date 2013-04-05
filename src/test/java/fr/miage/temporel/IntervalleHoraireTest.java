/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package fr.miage.temporel;

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
public class IntervalleHoraireTest {
    
    public IntervalleHoraireTest() {
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
     * Test of getEvenementsRec method, of class IntervalleHoraire.
     */
    @Test
    public void testGetEvenementsRec() {
        System.out.println("getEvenementsRec");
        IntervalleHoraire instance = null;
        List expResult = null;
        List result = instance.getEvenementsRec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvenementsRec method, of class IntervalleHoraire.
     */
    @Test
    public void testSetEvenementsRec() {
        System.out.println("setEvenementsRec");
        List<EvenementRecurrent> evenementsRec = null;
        IntervalleHoraire instance = null;
        instance.setEvenementsRec(evenementsRec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateDebut method, of class IntervalleHoraire.
     */
    @Test
    public void testGetDateDebut() {
        System.out.println("getDateDebut");
        IntervalleHoraire instance = null;
        DateTempo expResult = null;
        DateTempo result = instance.getDateDebut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateDebut method, of class IntervalleHoraire.
     */
    @Test
    public void testSetDateDebut() {
        System.out.println("setDateDebut");
        DateTempo dateDebut = null;
        IntervalleHoraire instance = null;
        instance.setDateDebut(dateDebut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateFin method, of class IntervalleHoraire.
     */
    @Test
    public void testGetDateFin() {
        System.out.println("getDateFin");
        IntervalleHoraire instance = null;
        DateTempo expResult = null;
        DateTempo result = instance.getDateFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateFin method, of class IntervalleHoraire.
     */
    @Test
    public void testSetDateFin() {
        System.out.println("setDateFin");
        DateTempo dateFin = null;
        IntervalleHoraire instance = null;
        instance.setDateFin(dateFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEvenementRec method, of class IntervalleHoraire.
     */
    @Test
    public void testAddEvenementRec() {
        System.out.println("addEvenementRec");
        EvenementRecurrent evtRec = null;
        IntervalleHoraire instance = null;
        instance.addEvenementRec(evtRec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delEvenementRec method, of class IntervalleHoraire.
     */
    @Test
    public void testDelEvenementRec() {
        System.out.println("delEvenementRec");
        EvenementRecurrent evtRec = null;
        IntervalleHoraire instance = null;
        instance.delEvenementRec(evtRec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class IntervalleHoraire.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        IntervalleHoraire instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

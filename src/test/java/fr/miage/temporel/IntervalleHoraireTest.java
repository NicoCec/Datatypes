/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas, Cecile - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 */

/**
 * #Generated by Git-Commit-Id-Plugin
 * #Fri Apr 12 15:50:05 CEST 2013
 * git.commit.id.abbrev=1acfa21
 * git.commit.user.email=nicolas.dufour@etu.univ-nantes.fr
 * git.commit.message.full=Merge branch 'master' of https\://github.com/NicoCec/Datatypes\n
 * git.commit.id=1acfa2181849a6bc1b0f6b63e4955312bbd93d4e
 * git.commit.message.short=Merge branch 'master' of https\://github.com/NicoCec/Datatypes
 * git.commit.user.name=NicoCec
 * git.build.user.name=NicoCec
 * git.commit.id.describe=1acfa21-dirty
 * git.build.user.email=nicolas.dufour@etu.univ-nantes.fr
 * git.branch=master
 * git.commit.time=12.04.2013 @ 15\:42\:43 CEST
 * git.build.time=12.04.2013 @ 15\:50\:05 CEST
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
    
    private EvenementRecurrent reveil;
    private IntervalleHoraire periodeScolaire;
    
    private DateTempo dateRentree;
    private DateTempo dateVacances;
    
    
    private Heure h_reveil;
    
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
        h_reveil = new Heure(7, 00, 00);
        
        dateRentree = new DateTempo(1, 9, 2012, h_reveil);
        dateVacances = new DateTempo(30, 6, 2013, h_reveil);
        reveil = new EvenementRecurrent(TypeEvenementRecurrent.quotidien, "reveil");
        periodeScolaire = new IntervalleHoraire(dateRentree, dateVacances);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEvenementsRec method, of class IntervalleHoraire.
     */
    //@Test
    public void testGetEvenementsRec() {
     /*   System.out.println("getEvenementsRec");
        IntervalleHoraire instance = null;
        List expResult = null;
        List result = instance.getEvenementsRec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of setEvenementsRec method, of class IntervalleHoraire.
     */
    //@Test
    public void testSetEvenementsRec() {
      /*  System.out.println("setEvenementsRec");
        List<EvenementRecurrent> evenementsRec = null;
        IntervalleHoraire instance = null;
        instance.setEvenementsRec(evenementsRec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of getDateDebut method, of class IntervalleHoraire.
     */
    //@Test
    public void testGetDateDebut() {
       /* System.out.println("getDateDebut");
        IntervalleHoraire instance = null;
        DateTempo expResult = null;
        DateTempo result = instance.getDateDebut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of setDateDebut method, of class IntervalleHoraire.
     */
    //@Test
    public void testSetDateDebut() {
      /*  System.out.println("setDateDebut");
        DateTempo dateDebut = null;
        IntervalleHoraire instance = null;
        instance.setDateDebut(dateDebut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of getDateFin method, of class IntervalleHoraire.
     */
    //@Test
    public void testGetDateFin() {
       /* System.out.println("getDateFin");
        IntervalleHoraire instance = null;
        DateTempo expResult = null;
        DateTempo result = instance.getDateFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of setDateFin method, of class IntervalleHoraire.
     */
    //@Test
    public void testSetDateFin() {
      /*  System.out.println("setDateFin");
        DateTempo dateFin = null;
        IntervalleHoraire instance = null;
        instance.setDateFin(dateFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of addEvenementRec method, of class IntervalleHoraire.
     */
    @Test
    public void testAddEvenementRec() {
        System.out.println("addEvenementRec");
        assertTrue(periodeScolaire.getEvenementsRec().isEmpty());
        periodeScolaire.addEvenementRec(reveil);
        assertEquals(periodeScolaire, periodeScolaire);
        assertTrue(periodeScolaire.getEvenementsRec().size()==1);
    }

    /**
     * Test of delEvenementRec method, of class IntervalleHoraire.
     */
    @Test
    public void testDelEvenementRec() {
        System.out.println("delEvenementRec");
        periodeScolaire.addEvenementRec(reveil);
        assertTrue(periodeScolaire.getEvenementsRec().size()==1);
        periodeScolaire.delEvenementRec(reveil);
        assertEquals(periodeScolaire, periodeScolaire);
        assertTrue(periodeScolaire.getEvenementsRec().isEmpty());
    }

    /**
     * Test of toString method, of class IntervalleHoraire.
     */
    //@Test
    public void testToString() {
      /*  System.out.println("toString");
        IntervalleHoraire instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
}

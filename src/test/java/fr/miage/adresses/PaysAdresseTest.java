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

package fr.miage.adresses;

import java.util.ArrayList;
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
public class PaysAdresseTest {
    
    PaysAdresse france;
    PaysAdresse allemagne;
    private Ville paris;
    private Ville berlin;
    
    public PaysAdresseTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        france = new PaysAdresse("France");
        allemagne = new PaysAdresse("Allemagne");
        
        paris = new Ville("Paris");
        berlin = new Ville("Berlin");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addVille method, of class PaysAdresse.
     */
    @Test
    public void testAddVille() {
        System.out.println("addVille");
        assertTrue(france.getVilles().isEmpty());
        
        france.addVille(paris);
        allemagne.addVille(berlin);
        
        assertFalse(france.equals(allemagne));
        assertTrue (france.equals(france));
        assertTrue (allemagne.equals(allemagne));
        assertTrue(france.getVilles().get(0).equals(paris));
        assertTrue(france.getVilles().size() == 1);
    }

    /**
     * Test of delVille method, of class PaysAdresse.
     */
    @Test
    public void testDelVille() {
        System.out.println("delVille");
        france.addVille(paris);
        france.delVille(paris);
        
        assertTrue(france.getVilles().isEmpty());
        assertTrue (france.equals(france));
    }

    /**
     * Test of getNomP method, of class PaysAdresse.
     */
    //@Test
    /*public void testGetNomP() {
        System.out.println("getNomP");
        PaysAdresse instance = null;
        String expResult = "";
        String result = instance.getNomP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setNomP method, of class PaysAdresse.
     */
    //@Test
    /*public void testSetNomP() {
        System.out.println("setNomP");
        String nomP = "";
        PaysAdresse instance = null;
        instance.setNomP(nomP);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getVilles method, of class PaysAdresse.
     */
   // @Test
     /*public void testGetVilles() {
       System.out.println("getVilles");
        PaysAdresse instance = null;
        List expResult = null;
        List result = instance.getVilles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setVilles method, of class PaysAdresse.
     */
    //@Test
    /*public void testSetVilles() {
        System.out.println("setVilles");
        List<Ville> villes = null;
        PaysAdresse instance = null;
        instance.setVilles(villes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}

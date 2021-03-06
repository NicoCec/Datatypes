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
public class VilleTest {
    private Ville paris;
    private Ville berlin;
    private Lieux menard;
    private Lieux loquidy;
    
    public VilleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        paris = new Ville("Paris");
        berlin = new Ville("Berlin");
        
        menard = new Lieux(TypeLieux.rue, "Amédée Ménard", 33);
        loquidy = new Lieux(TypeLieux.rue, "Loquidy", 12);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNomV method, of class Ville.
     */
    //@Test
    /*public void testGetNomV() {
        System.out.println("getNomV");
        Ville instance = null;
        String expResult = "";
        String result = instance.getNomV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setNomV method, of class Ville.
     */
    //@Test
    /*public void testSetNomV() {
        System.out.println("setNomV");
        String nomV = "";
        Ville instance = null;
        instance.setNomV(nomV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getLieux method, of class Ville.
     */
    //@Test
    /*public void testGetLieux() {
        System.out.println("getLieux");
        Ville instance = null;
        List expResult = null;
        List result = instance.getLieux();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setLieux method, of class Ville.
     */
    //@Test
    /*public void testSetLieux() {
        System.out.println("setLieux");
        List<Lieux> lieux = null;
        Ville instance = null;
        instance.setLieux(lieux);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of addLieu method, of class Ville.
     */
    @Test
    public void testAddLieu() {
        System.out.println("addLieu");
        
        assertTrue(paris.getLieux().isEmpty());
        
        paris.addLieu(menard);
        berlin.addLieu(loquidy);
        
        assertFalse(paris.equals(berlin));
        assertTrue (paris.equals(paris));
        assertTrue (berlin.equals(berlin));
        assertTrue(paris.getLieux().get(0).equals(menard));
        assertTrue(paris.getLieux().size() == 1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delLieu method, of class Ville.
     */
    @Test
    public void testDelLieu() {
        System.out.println("delLieu");
        paris.addLieu(menard);
        paris.delLieu(menard);
        
        assertTrue(paris.getLieux().isEmpty());
        assertTrue (paris.equals(paris));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

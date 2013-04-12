/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 */

package fr.miage.financier;

import fr.miage.adresses.PaysAdresse;
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
public class DeviseTest {
    
    private Devise d1 = new Devise("euro");
    private Devise d2 = new Devise ("dollar");
    private PaysAdresse p1 = new PaysAdresse("france");
    private PaysAdresse p2 = new PaysAdresse("etats-unis");
    private List<PaysAdresse> listePays = new ArrayList<PaysAdresse>();
    private TauxDeConversion taux = new TauxDeConversion(0.4564883);
    
    public DeviseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Devise d1 = new Devise("euro");
        Devise d2 = new Devise ("dollar");
        PaysAdresse p1 = new PaysAdresse("france");
        PaysAdresse p2 = new PaysAdresse("etats-unis");
        List<PaysAdresse> listePays = new ArrayList<PaysAdresse>();
        TauxDeConversion taux = new TauxDeConversion(0.4564883);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ajouterPays method, of class Devise.
     */
    @Test
    public void testAjouterPays() {
        System.out.println("ajouterPays");
        d1.ajouterPays(p1);
        d1.ajouterPays(p2);
        assertEquals(2, d1.getMyListePays().size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of supprimerPays method, of class Devise.
     */
    @Test
    public void testSupprimerPays() {
        System.out.println("supprimerPays");
        d1.ajouterPays(p1);
        d1.ajouterPays(p2);
        d1.supprimerPays(p1);
        assertEquals(1, d1.getMyListePays().size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of convertir method, of class Devise.
     */
    @Test
    public void testConvertir() {
        System.out.println("convertir");
        Conversion result = d1.convertir(taux, d2, 10000);
        assertEquals(result.getMontantArrivee(), 4564.883, 0);
        assertEquals(result.getMontantDepart(), 10000, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Devise.
     */
  //  @Test
    /*public void testGetNom() {
        System.out.println("getNom");
        Devise instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setNom method, of class Devise.
     */
//    @Test
    /*public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Devise instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getMyListePays method, of class Devise.
     */
 //   @Test
    /*public void testGetMyListePays() {
        System.out.println("getMyListePays");
        Devise instance = null;
        List expResult = null;
        List result = instance.getMyListePays();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setMyListePays method, of class Devise.
     */
  //  @Test
    /*public void testSetMyListePays() {
        System.out.println("setMyListePays");
        List<PaysAdresse> myListePays = null;
        Devise instance = null;
        instance.setMyListePays(myListePays);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of toString method, of class Devise.
     */
    //@Test
    /*public void testToString() {
        System.out.println("toString");
        Devise instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}

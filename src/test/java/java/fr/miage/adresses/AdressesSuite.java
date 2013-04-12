/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 * identifiant : ${git.commit.id}
 */

package java.fr.miage.adresses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author E095440P
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({fr.miage.adresses.TypeLieuxTest.class, fr.miage.adresses.LieuxTest.class, fr.miage.adresses.TelephoneTest.class, fr.miage.adresses.VilleTest.class, fr.miage.adresses.NomUtilisateurTest.class, fr.miage.adresses.EmailTest.class, fr.miage.adresses.NomDomaineTest.class, fr.miage.adresses.PaysAdresseTest.class})
public class AdressesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

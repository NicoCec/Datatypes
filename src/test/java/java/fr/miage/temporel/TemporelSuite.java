/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 12-04-2013
 * identifiant : ${git.commit.id}
 */

package java.fr.miage.temporel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author E12B336Z
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({fr.miage.temporel.EvenementRecurrentTest.class, fr.miage.temporel.HeureTest.class, fr.miage.temporel.TypeEvenementRecurrentTest.class, fr.miage.temporel.IntervalleHoraireTest.class, fr.miage.temporel.DateTempoTest.class})
public class TemporelSuite {

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

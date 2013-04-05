/**
 * License The Apache Software License, Version 2.0
 * Copyright (C) 2013-2013 Nicolas - version 1.0-SNAPSHOT - All rights reserved.
 * Last modification 05-04-2013
 */

package java.fr.miage.mesures;

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
@Suite.SuiteClasses({fr.miage.mesures.QuantiteTest.class, fr.miage.mesures.UniteTest.class, fr.miage.mesures.ConversionTest.class, fr.miage.mesures.FacteurConversionTest.class})
public class MesuresSuite {

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
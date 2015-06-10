/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hussein
 */
public class DoolhofTest {
    
    public DoolhofTest() {
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
     * Test of main method, of class Doolhof.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Doolhof.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of refreshFrame method, of class Doolhof.
     */
    @Test
    public void testRefreshFrame() {
        System.out.println("refreshFrame");
        Doolhof instance = new Doolhof();
        instance.refreshFrame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mazeStart method, of class Doolhof.
     */
    @Test
    public void testMazeStart() {
        System.out.println("mazeStart");
        Doolhof instance = new Doolhof();
        instance.mazeStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

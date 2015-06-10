/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
public class SpelerTest {

    public SpelerTest() {
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
     * Test of getAmmo method, of class Speler.
     */
    @Test
    public void testGetAmmo() {
        System.out.println("getAmmo");
        Speler instance = new Speler();
        int expResult = 0;
        int result = instance.getAmmo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmmo method, of class Speler.
     */
    @Test
    public void testSetAmmo() {
        System.out.println("setAmmo");
        int ammo = 0;
        Speler instance = new Speler();
        instance.setAmmo(ammo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSteps method, of class Speler.
     */
    @Test
    public void testGetSteps() {
        System.out.println("getSteps");
        Speler instance = new Speler();
        int expResult = 0;
        int result = instance.getSteps();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beweeg method, of class Speler.
     */
    @Test
    public void testBeweeg() {
        System.out.println("beweeg");
        int dir = 0;
        Speler instance = new Speler();
        instance.beweeg(dir);
        assertEquals(instance, this);

        // TODO review the generated test code and remove the default call to fail.
        //   fail("The test case is a prototype.");
    }

    @Test
    public void testCase1() {
        Speler instance = new Speler();
        int dir = 0;
        Tegel naar = null;
        SpelObject stuk;
        instance.beweeg(dir);
        try {
            Robot robot = new Robot();

            stuk = naar.getMijnObject();

            robot.keyPress(KeyEvent.VK_UP);
            robot.keyRelease(KeyEvent.VK_UP);

            if (!(stuk instanceof Muur)) {
                if (stuk != null) {
                    assertNotNull("steps up", stuk);
                }
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test of getImage method, of class Speler.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Speler instance = new Speler();
        Image expResult = null;
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}

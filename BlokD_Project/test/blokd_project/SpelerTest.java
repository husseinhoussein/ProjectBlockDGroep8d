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


    @Test
    public void testRoutine1() {
        Tegel links = new Tegel(1, 1);
        Tegel rechts = new Tegel(0, 0);
        Speler speler = new Speler();
        links.setEast(rechts);
        rechts.setWest(links);
        links.setMijnObject(speler);

        speler.beweeg(KeyEvent.VK_RIGHT);

        assertEquals(rechts, speler.getTile());
    }

    @Test
    public void testRoutine2() {
        Tegel links = new Tegel(1, 1);
        Tegel rechts = new Tegel(0, 0);
        Speler speler = new Speler();
        Muur muur = new Muur(true);
        links.setEast(rechts);
        rechts.setWest(links);
        links.setMijnObject(speler);
        rechts.setMijnObject(muur);

        speler.beweeg(KeyEvent.VK_RIGHT);

        assertEquals(links, speler.getTile());
        assertEquals(rechts, muur.getTile());

    }

}

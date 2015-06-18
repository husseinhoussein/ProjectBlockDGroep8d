/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

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
    public void testRoutine1() {//Test bewegen zonder muur
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
    public void testRoutine2() {//test bewegen met muur
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

    @Test
    public void testRoutine3() {// test met bazooka
        Tegel links = new Tegel(1, 1);
        Tegel midden = new Tegel(2, 1);
        Tegel rechts = new Tegel(3, 1);
        Speler speler = new Speler();
        Bazooka bazooka = new Bazooka();
        Gras gras = new Gras();
        Muur muur = new Muur(true);

        links.setEast(midden);
        midden.setEast(rechts);
        midden.setWest(links);
        rechts.setWest(midden);

        links.setMijnObject(speler);
        midden.setMijnObject(bazooka);
        rechts.setMijnObject(muur);

        speler.beweeg(KeyEvent.VK_RIGHT);
        speler.vuurBazooka(KeyEvent.VK_RIGHT);

        assertEquals(midden, speler.getTile());
        assertTrue(rechts.getMijnObject() instanceof Gras);
        

    }

    @Test
    public void testRoutine4() {
        Tegel links = new Tegel(1, 1);
        Tegel midden = new Tegel(2, 1);
        Tegel rechts = new Tegel(3, 1);
        Speler speler = new Speler();
        Gras gras = new Gras();
        Muur muur = new Muur(true);

        links.setEast(midden);
        midden.setEast(rechts);
        midden.setWest(links);
        rechts.setWest(midden);

        links.setMijnObject(speler);
        midden.setMijnObject(gras);
        rechts.setMijnObject(muur);

        speler.beweeg(KeyEvent.VK_RIGHT);
        speler.vuurBazooka(KeyEvent.VK_RIGHT);

        assertEquals(midden, speler.getTile());
        assertTrue(rechts.getMijnObject() instanceof Muur);
    }
    @Test
    public void testRoutine5() {
        Tegel een = new Tegel(1, 1);
        Tegel twee = new Tegel(2, 1);

        Speler speler = new Speler();
        Bazooka bazooka = new Bazooka();

        een.setEast(twee);
        twee.setWest(een);

        een.setMijnObject(speler);
        twee.setMijnObject(bazooka);

        speler.beweeg(KeyEvent.VK_RIGHT);

        assertTrue(een.getMijnObject() instanceof Gras);
        assertTrue(twee.getMijnObject() instanceof Speler);
        assertTrue(speler.getAmmo() > 0);
    }
    
}

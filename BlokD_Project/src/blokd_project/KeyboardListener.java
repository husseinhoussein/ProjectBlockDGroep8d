package blokd_project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {

    Speler p;
    Map m;
    Doolhof s;
    private int STEPS = 0;

    public KeyboardListener(Speler p, Map m, Doolhof s) {
        this.p = p;
        this.m = m;
        this.s = s;

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        if (keycode == KeyEvent.VK_UP) {
            if (!m.getMap(p.getTileX(), p.getTileY() - 1).equals("w")) {
                p.beweeg(0, -1);
//                setStep();
            }
        }
        if (keycode == KeyEvent.VK_DOWN) {
            if (!m.getMap(p.getTileX(), p.getTileY() + 1).equals("w")) {
                p.beweeg(0, 1);
//                setStep();
            }
        }
        if (keycode == KeyEvent.VK_LEFT) {
            if (!m.getMap(p.getTileX() - 1, p.getTileY()).equals("w")) {
                p.beweeg(-1, 0);
//                setStep();

            }
        }
        if (keycode == KeyEvent.VK_RIGHT) {
            if (!m.getMap(p.getTileX() + 1, p.getTileY()).equals("w")) {
                p.beweeg(1, 0);
//                setStep();
            }
        }
    }

//    private void setStep() {
////        if (s.getSTEPS() < 0) {
//
//        STEPS = s.getSTEPS();
//        System.out.println(STEPS);
//        STEPS++;
//        System.out.println(STEPS); //nu kun je hopelijk zien of ie wordt opgehoogd, denk ik
//        s.setSTEPS(STEPS);
////        }
//
//    }

    public void keyReleased(KeyEvent e) {

    }

    public int getSTEPS() {
        return STEPS;
    }

    public void keyTyped(KeyEvent e) {

    }
}

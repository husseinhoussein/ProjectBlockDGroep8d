package blokd_project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyboardListener extends KeyAdapter {

    private Speler p;
    private Map m;
    private JLabel label;
    private Muur w;

    public KeyboardListener(Speler p, Map m, JLabel label, Muur w) {
        this.p = p;
        this.m = m;
        this.label = label;
        this.w = w;

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        if (keycode == KeyEvent.VK_UP) {
            if (w.checkWallNorth()) {
                p.beweeg(0, -1);
            }
        }
        if (keycode == KeyEvent.VK_DOWN) {
            if (w.checkWallSouth()){
                p.beweeg(0, 1);
            }
        }
        if (keycode == KeyEvent.VK_LEFT) {
            if (w.checkWallWest()) {
                p.beweeg(-1, 0);

            }
        }
        if (keycode == KeyEvent.VK_RIGHT) {
            if (w.checkWallEast()) {
                p.beweeg(1, 0);

            }
        }
        this.label.setText("Aantal stappen: " + p.getSteps());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}

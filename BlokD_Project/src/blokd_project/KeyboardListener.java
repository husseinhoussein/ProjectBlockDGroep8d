package blokd_project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class KeyboardListener extends KeyAdapter {

    private Speler p;
    private JLabel label;
    private JLabel label2;
    private int laatsteRichting = KeyEvent.VK_UP;

    public KeyboardListener(Speler p, JLabel label, JLabel label2) {
        this.p = p;
        this.label = label;
        this.label2 = label2;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            p.beweeg(e.getKeyCode());
            laatsteRichting = e.getKeyCode();
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            p.vuurBazooka(laatsteRichting);
        }
        this.label.setText("Aantal stappen: " + p.getSteps());
        this.label2.setText("Ammo: " + p.getAmmo());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
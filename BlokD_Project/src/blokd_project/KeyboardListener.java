package blokd_project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class KeyboardListener extends KeyAdapter {

    private  Valsspeler c;
    private Speler p;
    private JLabel label;
    private JLabel label2;
    private int laatsteRichting = KeyEvent.VK_UP;
    private int richtingC = KeyEvent.VK_LEFT;
    

    public KeyboardListener(Speler p, JLabel label, JLabel label2, Valsspeler c) {
        this.p = p;
        this.c = c;
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
        else if(e.getKeyCode() == KeyEvent.VK_J || e.getKeyCode() == KeyEvent.VK_K ){
            richtingC = e.getKeyCode();
            c.beweegRandom(richtingC);
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
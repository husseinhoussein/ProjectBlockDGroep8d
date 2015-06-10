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
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            p.vuurBazooka(laatsteRichting);
        } else if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            p.beweeg(e.getKeyCode());
            laatsteRichting = e.getKeyCode();
            
//        p.vuurBazooka(e.getKeyCode());

            this.label.setText("Aantal stappen: " + p.getSteps());
            this.label2.setText("Ammo: " + p.getAmmo());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        p.vuurBazooka(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
//        p.vuurBazooka(e.getKeyCode());
/*        if (keycode == KeyEvent.VK_UP) {
 //  if (!tegel.getNorth().equals(veld.doolhof.equals("w"))) {
 p.beweeg(0, -1);
                
                
 //     }
 }
 if (keycode == KeyEvent.VK_DOWN) {
          
 //  if (tegel.getSouth()) {
 p.beweeg(0, 1);
          
 // }
 }
 if (keycode == KeyEvent.VK_LEFT) {
 //            if (tegel.getWest().equals(veld.doolhof.equals("w"))) {
 p.beweeg(-1, 0);

 //            }
 }
 if (keycode == KeyEvent.VK_RIGHT) {
 //            if (tegel.getEast().equals(veld.doolhof.equals("w"))) {
 p.beweeg(1, 0);

 //            }
 }*/

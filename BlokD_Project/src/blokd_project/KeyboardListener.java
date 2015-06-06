package blokd_project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class KeyboardListener extends KeyAdapter {

    private Speler p;
    private JLabel label;

    public KeyboardListener(Speler p, JLabel label) {
        this.p = p;
        this.label = label;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        p.beweeg(e.getKeyCode());
        
        this.label.setText("Aantal stappen: " + p.getSteps());
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

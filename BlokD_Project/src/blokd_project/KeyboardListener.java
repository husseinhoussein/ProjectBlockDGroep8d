package blokd_project;

import com.sun.java.accessibility.util.AWTEventMonitor;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {
Speler p;

    public KeyboardListener(Speler p) {
        this.p = p;
    }

    
@Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        if (keycode == KeyEvent.VK_UP) {
            p.beweeg(0, -32, 0, -1);
        }
        if (keycode == KeyEvent.VK_DOWN) {
            p.beweeg(0, 32, 0, 1);
        }
        if (keycode == KeyEvent.VK_LEFT) {
            p.beweeg(-32, 0, -1, 0);
        }
        if (keycode == KeyEvent.VK_RIGHT) {
            p.beweeg(32, 0, 1, 0);
        }
    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }
}

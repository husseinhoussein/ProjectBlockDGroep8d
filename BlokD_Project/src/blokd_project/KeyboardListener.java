package blokd_project;

import com.sun.java.accessibility.util.AWTEventMonitor;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {
Speler p;
Map m;

    public KeyboardListener(Speler p) {
        this.p = p;
        
    }

    public KeyboardListener(Map m) {
        this.m = m;
    }
    
    

    
@Override
    	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		if(keycode == KeyEvent.VK_UP)
		{
			if(!m.getMap(p.getTileX(), p.getTileY() -1).equals("w"));
			{
				p.beweeg(0, -1);
			}
		}
		if(keycode == KeyEvent.VK_DOWN)
		{
			if(!m.getMap(p.getTileX(), p.getTileY() +1).equals("w"));
			{
				p.beweeg(0, 1);
			}
		}
		if(keycode == KeyEvent.VK_LEFT)
		{
			if(!m.getMap(p.getTileX() -1 , p.getTileY()).equals("w"));
			{
				p.beweeg(-1, 0);
			}
		}
		if(keycode == KeyEvent.VK_RIGHT)
		{
			if(!m.getMap(p.getTileX() + 1, p.getTileY()).equals("w"));
			{
				p.beweeg(1, 0);
			}
		}
	}

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }
}


package blokd_project;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Veld extends JPanel implements ActionListener
{
//    private int postitieX;
//    private int positieY;
//    private SpelObject item;
    
    public Timer timer;
    private Map m;
    private Speler p;
    private Vriend f;
    
    public Veld(/*int postitieX, int positieY, SpelObject plaatje*/) {
		
                m = new Map();
		p = new Speler();
		addKeyListener(new KeyboardListener(p, m));
		setFocusable(true);
		timer = new Timer(25, this);
		timer.start();
	}

	public void actionPerformed(ActionEvent e)
	{
		repaint();	
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		//g.setColor(Color.red);
		//g.fillRectangle(45, 60, 32, 32);

		for(int y = 0; y < 25; y++)
		{
			for(int x = 0; x < 25; x++)
			{
				if(m.getMap(x,y).equals("g"))
				{g.drawImage(m.getGrass(), x*25, y*25, null);}

				if(m.getMap(x,y).equals("w"))
				{g.drawImage(m.getWall(), x*25, y*25, null);}

				if(m.getMap(x,y).equals("f"))
				{g.drawImage(m.getFriend(), x*25, y*25, null);}

			}
		}
	g.drawImage(p.getPlayer(), p.getTileX()*25, p.getTileY()*25, null);
        //g.drawImage(f.getFriend(), f.getTileX()*25, f.getTileY()*25, null);

        }
    
    private void verwijderObject(int posX, int posY)
    {
        //verwijder een object op meegegeven veld
    }
    
    private void plaatsObject(int posX, int posY)
    {
        //plaats een object op meegegeven veld
    }
    
    private Veld getNeighbour(int posX, int posY)
    {
        //geeft buurvelde terug van meegegeven veld
       return null;
    }



}
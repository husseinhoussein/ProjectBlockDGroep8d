
package blokd_project;

import java.awt.Color;
import java.awt.Font;
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
    private String message = "";
    private boolean win = false;
    private Font font = new Font("Serif", Font.BOLD, 48);
    public Timer timer;
    
    private Map m;
    private Speler p;
    private Vriend f;
    private Muur w;
    private Gras g;
    private Helper h;
    private Bazooka b;
    private Valsspeler c;
    private Doolhof s;
    
    public Veld(/*int postitieX, int positieY, SpelObject plaatje*/) {
		
                m = new Map();
		p = new Speler();
                f = new Vriend();
                w = new Muur();
                g = new Gras();
                h = new Helper();
                b = new Bazooka();
                c = new Valsspeler();
               
               // s = new Doolhof();
		addKeyListener(new KeyboardListener(p, m, s));
		setFocusable(true);
		timer = new Timer(25, this);
		timer.start();
	}

    @Override
	public void actionPerformed(ActionEvent e)
	{
            if (m.getMap(p.getTileX(), p.getTileY()).equals("f"))
		{
			message = "You win";
			win = true;
		}
		repaint();	
	}

    @Override
	public void paint(Graphics graphics)
	{
		super.paint(graphics);
                if (!win)
                {
                    for(int y = 0; y < 25; y++)
                    {
                            for(int x = 0; x < 25; x++)
                            {
                                    if(m.getMap(x,y).equals("g"))
                                    {graphics.drawImage(g.getGrassImage(), x*25, y*25, null);}

                                    if(m.getMap(x,y).equals("w"))
                                    {graphics.drawImage(w.getWallImage(), x*25, y*25, null);}

                                    if(m.getMap(x,y).equals("f"))
                                   
                                    {graphics.drawImage(f.getFriend(), x*25, y*25, null);}
                                    
                                    if(m.getMap(x,y).equals("h"))
                                    {graphics.drawImage(h.getHelperImage(), x*25, y*25, null);}
                                    
                                    if(m.getMap(x,y).equals("b"))
                                    {graphics.drawImage(b.getBazookaImage(), x*25, y*25, null);}
                                    
                                    if(m.getMap(x,y).equals("c"))
                                    {graphics.drawImage(c.getCheaterImage(), x*25, y*25, null);}


                            }
                    }
                }
                
                if(win)
		{
		
			graphics.setColor(Color.BLACK);
			graphics.setFont(font);
			
			graphics.drawString (message, 150, 250);
		}
	graphics.drawImage(p.getPlayer(), p.getTileX()*25, p.getTileY()*25, null);

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
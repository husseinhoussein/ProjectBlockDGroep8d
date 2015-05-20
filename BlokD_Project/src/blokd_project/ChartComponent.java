/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.JComponent;


public class ChartComponent extends JComponent
{
    public ChartComponent()
    {
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        g.drawString("DoolhofGame, WELKOM", 250, 150);
    }
    
   
}


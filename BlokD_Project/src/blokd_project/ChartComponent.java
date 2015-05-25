/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import java.awt.Graphics;
import javax.swing.JComponent;


public class ChartComponent extends JComponent
{
    private int data = 10;
    
    public ChartComponent(int data) {
        this.data = data;
    }
    
    
    @Override
    public void paintComponent(Graphics g)
    {
            g.fillRect(data, data, 20, 20);
    }
    
   
}


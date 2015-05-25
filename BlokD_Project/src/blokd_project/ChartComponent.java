/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import java.awt.Graphics;
import javax.swing.JComponent;

public class ChartComponent extends JComponent {

    private int[][] maze;
    private int x;
    private int y;

    public ChartComponent(int data, int[][] maze, int x, int y) {
        this.maze = maze;
        this.x = x;
        this.y = y;
    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawString("test", 10, 10);
    }
//writers block :| //fantasie block.. hoe kwamen die plusjes in de output?, lets find out i guess
}

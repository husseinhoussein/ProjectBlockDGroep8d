
package blokd_project;

import javax.swing.JFrame;

public class Doolhof 
{
    private Level currentLevel;
    
    public static void main(String[] args) {
        new Doolhof();
    }

    public Doolhof() {
        JFrame frame = new JFrame();
	frame.setTitle("Maze Game");
	frame.add(new Veld());
	frame.setSize(1000,1000);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void mazeStart()
    {
        //enable speler om spelfuncties te gebruiken (te bewegen etc)
    }
    
    private void mazeReset()
    {
        //regenerate level
    }
    
    private void destroyWall()
    {
        //roep Veld.verwijderObject aan
    }
}

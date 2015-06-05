package blokd_project;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

public class Speler extends SpelObject {

//    private int tileX, tileY;
    private Image playerImage;
    private String playerPath = "player.png";
    private int steps;
    Doolhof h;

    public Speler() {
        ImageIcon img = new ImageIcon(getImagePath(playerPath));
        playerImage = img.getImage();


    }

    public int getSteps() {
        return steps;
    }



    public void beweeg(int dx, int dy) {
    
       steps++;
    }

    private void vuurBazooka() {
        //verlaag ammunitie
    }

    @Override
    public String toString() {
        return "S";
    }

    @Override
    public Image getImage() {
        return playerImage;
    }

}

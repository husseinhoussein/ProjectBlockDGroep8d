package blokd_project;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

public class Speler extends SpelObject {

//    private String character = "C"; //deze moet plaatje van spelobject overschrijven private SpelObject character = 
//    private boolean heeftVriendGevonden = false;
//    private int ammunitie = 0;
//    private int aantalStappen = 0; //aantal stappen telt op 
    private int tileX, tileY;
    private Image playerImage;
    private int steps;

    public Speler() {
        ImageIcon img = new ImageIcon(getPath("Images/player.png"));
        playerImage = img.getImage();

        tileX = 12;
        tileY = 13;
    }

    public Image getPlayerImage() {
        return playerImage;
    }

    public int getSteps() {
        return steps;
    }

    public int getTileX() {
        return tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void beweeg(int dx, int dy) {

        tileX += dx;
        tileY += dy;
        steps++;
    }

    private void vuurBazooka() {
        //verlaag ammunitie
    }

    @Override
    public String toString() {
        return "S";
    }

}

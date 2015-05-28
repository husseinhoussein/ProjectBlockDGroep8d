package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Speler extends SpelObject {

//    private String character = "C"; //deze moet plaatje van spelobject overschrijven private SpelObject character = 
//    private boolean heeftVriendGevonden = false;
//    private int ammunitie = 0;
//    private int aantalStappen = 0; //aantal stappen telt op 
    private int x, y, tileX, tileY;
    private Image playerImage;

    public Speler() {
        ImageIcon img = new ImageIcon("C:\\Users\\Hussein\\Documents\\GitHub\\ProjectBlockDGroep8d\\BlokD_Project\\src\\blokd_project\\Images\\player.png");
        playerImage = img.getImage();
        x = 32;
        y = 32;
        tileX = 1;
        tileY = 1;
    }

    public Image getPlayer() {
        return playerImage;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTileX() {
        return tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void beweeg(int dx, int dy, int tx, int ty) {
        x += dx;
        y += dy;

        tileX += tx;
        tileY += ty;
    }

    private void vuurBazooka() {
        //verlaag ammunitie
    }

    @Override
    public String toString() {
        return "S";
    }

}

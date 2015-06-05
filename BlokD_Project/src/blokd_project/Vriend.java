package blokd_project;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Vriend extends SpelObject {

    private int tileX, tileY;
    private Image friendImage;
    private String friendPath = "friend.png";
    private boolean win = false;

    public Vriend() {

        ImageIcon img = new ImageIcon(getImagePath(friendPath));
        friendImage = img.getImage();

        tileX = 1;
        tileY = 1;
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
    }

    @Override
    public Image getImage() {
        return friendImage;
    }

}

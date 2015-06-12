package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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

    @Override
    public void pakObject(Speler speler) {
        int result = JOptionPane.showConfirmDialog(null, "Next Level??", "You win!!", JOptionPane.YES_NO_OPTION);
        if (result == 0) {
            Doolhof h = new Doolhof();
            h.refreshFrame();
        } else if (result == 1) {
            System.out.println("something");
        }
    }
}

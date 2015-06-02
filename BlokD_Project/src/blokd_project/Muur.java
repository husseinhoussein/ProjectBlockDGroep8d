package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Muur extends SpelObject {

    private boolean kanKapot = false;
    private Image wallImage;
    private Map m;
    private Speler p;

    public Muur(Speler p, Map m) {
        ImageIcon img = new ImageIcon(getPath("Images/wall.png"));
        wallImage = img.getImage();
        this.p = p;
        this.m = m;
    }

    public Image getWallImage() {
        return wallImage;
    }

    public boolean checkWallNorth() {
        if (!m.getMap(p.getTileX(), p.getTileY() - 1).equals("w")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkWallSouth() {
        if (!m.getMap(p.getTileX(), p.getTileY() + 1).equals("w")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkWallWest() {
        if (!m.getMap(p.getTileX() - 1, p.getTileY()).equals("w")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkWallEast() {
        if (!m.getMap(p.getTileX() + 1, p.getTileY()).equals("w")) {
            return true;
        } else {
            return false;
        }
    }

}

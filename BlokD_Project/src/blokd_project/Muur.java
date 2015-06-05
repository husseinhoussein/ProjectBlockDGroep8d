package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Muur extends SpelObject {

//    private boolean kanKapot = false;
    private Image wallImage;
    private String wallPath = "wall.png";

    public Muur(/*boolean kanKapot*/) {
        //this.kanKapot = kanKapot;
        ImageIcon img = new ImageIcon(getImagePath(wallPath));
        wallImage = img.getImage();
    }



//    public boolean checkWallNorth() {
//        if (!m.getMap(p.getTileX(), p.getTileY() - 1).equals("w")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean checkWallSouth() {
//        if (!m.getMap(p.getTileX(), p.getTileY() + 1).equals("w")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean checkWallWest() {
//        if (!m.getMap(p.getTileX() - 1, p.getTileY()).equals("w")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean checkWallEast() {
//        if (!m.getMap(p.getTileX() + 1, p.getTileY()).equals("w")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    @Override
    public Image getImage() {
        return wallImage;
    }
}

package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Muur extends SpelObject {

    private boolean kanKapot = false;
    private Image wallImage;
    private String wallPath = "wall.png";

    public Muur(boolean kanKapot) {
        this.kanKapot = kanKapot;
        ImageIcon img = new ImageIcon(getImagePath(wallPath));
        wallImage = img.getImage();
    }

    @Override
    public Image getImage() {
        return wallImage;
    }

    public boolean isKanKapot() {
        return kanKapot;
    }

    public void setKanKapot(boolean kanKapot) {
        this.kanKapot = kanKapot;
    }

    @Override
    public void pakObject(Speler speler) {
        if (kanKapot == true) {
            getTile().verwijderObject();
        }
    }
}

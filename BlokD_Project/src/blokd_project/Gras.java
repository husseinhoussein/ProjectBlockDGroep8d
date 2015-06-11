package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Gras extends SpelObject {

    private Image grassImage;
    private String grassPath = "grass.png";

    public Gras() {
        ImageIcon img = new ImageIcon(getImagePath(grassPath));
        grassImage = img.getImage();
    }

    @Override
    public Image getImage() {
        return grassImage;
    }

    @Override
    public void pakObject(Speler speler) {
        getTile().verwijderObject();
    }

}

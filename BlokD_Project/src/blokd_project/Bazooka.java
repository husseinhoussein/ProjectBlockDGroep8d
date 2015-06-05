package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Bazooka extends SpelObject {

    private int kogel = 1;

    private Image bazookaImage;
    private String bazookaPath = "bazooka.png";

    public Bazooka() {
        ImageIcon img = new ImageIcon(getImagePath(bazookaPath));
        bazookaImage = img.getImage();
    }

    @Override
    public Image getImage() {
        return bazookaImage;
    }

}

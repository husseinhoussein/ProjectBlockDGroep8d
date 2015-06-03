
package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Gras extends SpelObject {
    private Image grassImage;
      public Gras() {
        ImageIcon img = new ImageIcon(getPath("Images/grass.png"));
        grassImage = img.getImage();
    }

    public Image getGrassImage() {
        return grassImage;
    }
    
}


package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Muur extends SpelObject 
{
    private boolean kanKapot = false;
    private Image wallImage;
   

    public Muur() {
        ImageIcon img = new ImageIcon(getPath("Images/wall.png"));
        wallImage = img.getImage();
    }

    public Image getWallImage() {
        return wallImage;
    }
    
    
}

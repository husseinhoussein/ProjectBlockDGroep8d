
package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Bazooka extends SpelObject
{
    private int kogel = 1;
    
      private Image bazookaImage;
      public Bazooka() {
        ImageIcon img = new ImageIcon(getPath("Images/bazooka.png"));
        bazookaImage = img.getImage();
    }

    public Image getBazookaImage() {
        return bazookaImage;
    }
    
    
    private void pakObject(Speler speler)
    {
        //interactie met speler en bazooka/ammunitie
    }
}

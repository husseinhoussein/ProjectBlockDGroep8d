
package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Helper extends SpelObject
{
    
    private Image helperImage;
      public Helper() {
        ImageIcon img = new ImageIcon(getPath("Images/helper.png"));
        helperImage = img.getImage();
    }

    public Image getHelperImage() {
        return helperImage;
    }
    
    private void kortsteRoute()
    {
        //code waarmee de kortste route wordt weergegeven
    }
}

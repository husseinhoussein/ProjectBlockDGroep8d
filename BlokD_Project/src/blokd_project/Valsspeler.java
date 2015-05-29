
package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Valsspeler extends SpelObject
{
      private Image cheaterImage;
      public Valsspeler() {
        ImageIcon img = new ImageIcon(getPath("Images/cheater.png"));
        cheaterImage = img.getImage();
    }

    public Image getCheaterImage() {
        return cheaterImage;
    }
    
    private void minderStappen()
    {
        //vermindert aantal stappen dat de speler heeft gezet
    }
    
    private void beweegRandom()
    {
        //code om de valsspeler uit zichzelf over het veld te laten bewegen
    }
}

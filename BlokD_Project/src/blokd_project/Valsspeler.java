package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Valsspeler extends SpelObject {

    private Image cheaterImage;
    private String cheaterPath = "cheater.png";

    public Valsspeler() {
        ImageIcon img = new ImageIcon(getImagePath(cheaterPath));
        cheaterImage = img.getImage();
    }



    private void minderStappen() {
        //vermindert aantal stappen dat de speler heeft gezet
    }

    private void beweegRandom() {
        //code om de valsspeler uit zichzelf over het veld te laten bewegen
    }

    @Override
    public Image getImage() {
        return cheaterImage;
    }
}

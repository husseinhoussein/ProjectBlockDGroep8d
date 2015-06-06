package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Helper extends SpelObject {

    private Image helperImage;
    private String helperPath = "helper.png";

    public Helper() {
        ImageIcon img = new ImageIcon(getImagePath(helperPath));
        helperImage = img.getImage();
    }


    private void kortsteRoute() {
        //code waarmee de kortste route wordt weergegeven
    }
    
    @Override
    public Image getImage() {
        return helperImage;
    }
}

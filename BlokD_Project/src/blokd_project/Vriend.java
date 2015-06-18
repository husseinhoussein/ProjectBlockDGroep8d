package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vriend extends SpelObject {

    private Image friendImage;
    private String friendPath = "friend.png";
    private boolean win = false;

    public Vriend() {
        ImageIcon img = new ImageIcon(getImagePath(friendPath));
        friendImage = img.getImage();
    }

    @Override
    public Image getImage() {
        return friendImage;
    }

    @Override
    public void pakObject(Speler speler) {
        int result = JOptionPane.showConfirmDialog(null, "Next Level??", "You win!!", JOptionPane.YES_NO_OPTION);
        Doolhof h = new Doolhof();
        if (result == 0) {
            
            h.refreshFrame();
        } else if (result == 1) {
            h.exitGame();
        }
    }
}

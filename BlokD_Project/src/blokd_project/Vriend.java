
package blokd_project;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

public class Vriend extends SpelObject
{
    private int tileX, tileY;
    private Image friendImage;
     
    public Vriend() {
        ImageIcon img = new ImageIcon(getPath("Images/friend.png"));
        friendImage = img.getImage();
        
        tileX = 1;
        tileY = 1;
    }

    public Image getFriendImage() {
        return friendImage;
    }

    public int getTileX() {
        return tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void beweeg(int dx, int dy) {
        tileX += dx;
        tileY += dy;
    }
    
    private void spelBeindigen()
    {
        //wanneer Speler op Vriend komt, moet de game worden gestopt.
    }
}

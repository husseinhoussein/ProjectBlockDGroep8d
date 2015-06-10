package blokd_project;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Speler extends SpelObject {

//    private int tileX, tileY;
    private Image playerImage;
    private String playerPath = "player.png";
    private int steps;
    private int ammo;
    boolean magSchieten = false;
    private Map m;
    private Helper h;

    public Speler() {
        ImageIcon img = new ImageIcon(getImagePath(playerPath));
        playerImage = img.getImage();
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getSteps() {
        return steps;
    }

    public void beweeg(int dir) {
        Tegel naar = null;
        SpelObject stuk = null;

        // naar.getBuur(dir);
        switch (dir) {
            case KeyEvent.VK_UP:
                naar = getTile().getNorth();
                break;
            case KeyEvent.VK_RIGHT:
                naar = getTile().getEast();
                break;
            case KeyEvent.VK_DOWN:
                naar = getTile().getSouth();
                break;
            case KeyEvent.VK_LEFT:
                naar = getTile().getWest();
                break;
            default:
            case KeyEvent.VK_SPACE:
                if (ammo != 0) {
                    magSchieten = true;
                }
                break;
        }

        if (naar != null && !(stuk instanceof Muur)) {
            stuk = naar.getMijnObject();
            if (stuk != null) {
                stuk.pakObject(this);
                getTile().verplaatsObject(naar);
                steps++;

            }
        }
    }

//        if ((stuk instanceof Muur)) {
//            if (magSchieten == true) {
//                stuk.pakObject(this);
//                getTile().verplaatsObject(naar);
//                magSchieten = false;
//                ammo--;
//            }
//        }
//}
    @Override
    public Image getImage() {
        return playerImage;
    }

    void verlaagAmmo() {
        ammo--;
    }

    void verlaagStappen() {
        steps = steps - 10;
    }

    void verhoogAmmo() {
        ammo++;
    }

    void vuurBazooka(int dir) {
        if (ammo > 0) {
            Tegel naar = null;
            SpelObject stuk = null;
            stuk = naar.getMijnObject();
            while (!(stuk instanceof Muur)) {

                // naar.getBuur(dir);
                switch (dir) {

                    case KeyEvent.VK_SPACE:
                        if (ammo != 0) {
                            magSchieten = true;
                        }
                        break;
                    default:
                }
            }
            stuk.pakObject(this);
        }
    }

    @Override
    public void pakObject(Speler speler) {
    }
}

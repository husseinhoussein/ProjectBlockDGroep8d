package blokd_project;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Speler extends SpelObject {

    private Image playerImage;
    private String playerPath = "player.png";
    private int steps;
    private int ammo;

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
        }

        stuk = naar.getMijnObject();
        if (!(stuk instanceof Muur)) {
            if (stuk != null) {
                stuk.pakObject(this);
            }
            getTile().verplaatsObject(naar);
            steps++;
        }
    }

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
        Tegel naar = null;
        SpelObject stuk = null;

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
        }

        if (ammo > 0) {
            stuk = naar.getMijnObject();
            while (!(stuk instanceof Muur)) {

                switch (dir) {
                    case KeyEvent.VK_UP:
                        naar = naar.getNorth();
                        break;
                    case KeyEvent.VK_RIGHT:
                        naar = naar.getEast();
                        break;
                    case KeyEvent.VK_DOWN:
                        naar = naar.getSouth();
                        break;
                    case KeyEvent.VK_LEFT:
                        naar = naar.getWest();
                        break;
                    default:
                }
                stuk = naar.getMijnObject();
            }
            stuk.pakObject(this);
            verlaagAmmo();
        }
    }

    @Override
    public void pakObject(Speler speler) {

    }
}

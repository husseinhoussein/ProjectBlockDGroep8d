package blokd_project;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Speler extends SpelObject {

//    private int tileX, tileY;
    private Image playerImage;
    private String playerPath = "player.png";
    private int steps;
    private int ammo;
    boolean direction = false;
    boolean playerState = false;

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
        SpelObject stuk;

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

            case KeyEvent.VK_SPACE:
                if (ammo != 0) {
                    playerState = true;
                }
                break;

        }

        stuk = naar.getMijnObject();
        if (!(stuk instanceof Muur)) {
            if (stuk != null) {
                stuk.pakObject();
                steps++;
            }

            getTile().verplaatsObject(naar);
        }
        if ((stuk instanceof Valsspeler)) {
            for (int i = 0; i <= 10; i++) {
                steps--;
            }
        }

        if ((stuk instanceof Bazooka)) {
            ammo++;
            // .setText("Ammo: " + getAmmo());
        }
        if ((stuk instanceof Helper)) {
            //future maze algo h.findpath(); or somesnazz
        }

        if ((stuk instanceof Vriend)) {
            stuk.pakObject();
              int result = JOptionPane.showConfirmDialog(null, "You win!!", "Titus Maximus?", JOptionPane.YES_NO_OPTION);
              System.out.println(result);
        }

        if ((stuk instanceof Muur)) {
            if (playerState == true) {
                if (direction = true) {
                    stuk.pakObject();
                    getTile().verplaatsObject(naar);
                    playerState = false;
                    ammo--;
                }
            }
        }
    }

    @Override
    public Image getImage() {
        return playerImage;
    }
}

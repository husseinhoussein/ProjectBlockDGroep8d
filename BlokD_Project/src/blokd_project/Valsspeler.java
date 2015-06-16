package blokd_project;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Valsspeler extends SpelObject {

    private Image cheaterImage;
    private String cheaterPath = "cheater.png";
    private Timer timer = new Timer();

    public Valsspeler() {
        ImageIcon img = new ImageIcon(getImagePath(cheaterPath));
        cheaterImage = img.getImage();
        randomDir();

    }

    public void beweegRandom(int dir) {
        Tegel naar = null;
        SpelObject stuk = null;

        switch (dir) {
            case KeyEvent.VK_I:
                naar = getTile().getNorth();
                break;
            case KeyEvent.VK_L:
                naar = getTile().getEast();
                break;
            case KeyEvent.VK_K:
                naar = getTile().getSouth();
                break;
            case KeyEvent.VK_J:
                naar = getTile().getWest();
                break;
            default:
        }

        stuk = naar.getMijnObject();
        if (!(stuk instanceof Muur)) {
            if (stuk != null) {
                getTile().verplaatsObject(naar);
            }
        }
    }

    public void randomDir() {
        Tegel naar = null;
        SpelObject stuk = null;
        int rDir = 0;
        Random random = new Random();
        try {
            Robot robot = new Robot();

            for (int i = 0; i <= 15; i++) {
                int randomInt = random.nextInt(4);

                if (randomInt == 0) {
                    if (!(stuk instanceof Muur)) {
//                        naar = getTile().getWest();
                        robot.keyPress(KeyEvent.VK_I);

                    } else {
                        robot.keyPress(KeyEvent.VK_K);
                    }

                }
                if (randomInt == 1) {
                    if (!(stuk instanceof Muur)) {
                        robot.keyPress(KeyEvent.VK_J);
                    } else {
                        robot.keyPress(KeyEvent.VK_L);
                    }
                }
                if (randomInt == 2) {
                    if (!(stuk instanceof Muur)) {
                        robot.keyPress(KeyEvent.VK_K);
                    } else {
                        robot.keyPress(KeyEvent.VK_I);
                    }

                }
                if (randomInt == 3) {
                    if (!(stuk instanceof Muur)) {
                        robot.keyPress(KeyEvent.VK_L);
                    } else {
                        robot.keyPress(KeyEvent.VK_J);
                    }
                }
            }

        } catch (AWTException e) {
            e.printStackTrace();
        }

        timer.schedule(new TimerTask() {

            public void run() {
                randomDir();
            }
        }, 2000);
    }

    @Override
    public Image getImage() {
        return cheaterImage;
    }

    @Override
    public void pakObject(Speler speler) {
        speler.verlaagStappen();
    }
}

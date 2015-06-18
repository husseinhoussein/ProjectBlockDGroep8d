package blokd_project;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

public class Helper extends SpelObject {

    private Image helperImage;
    private Image puntjesImage;
    private String helperPath = "helper.png";
    private String puntjesPath = "puntje.png";
    private int padLengte = Integer.MAX_VALUE;
    private Timer timer = new Timer();
    ArrayList<Tegel> pad = new ArrayList<>();
    ArrayList<Tegel> kortstePad = new ArrayList<>();

    public Helper() {
        ImageIcon img = new ImageIcon(getImagePath(helperPath));
        helperImage = img.getImage();
        ImageIcon img2 = new ImageIcon(getImagePath(puntjesPath));
        puntjesImage = img2.getImage();

    }

    public Image getPuntjesImage() {
        return puntjesImage;
    }

    protected void kortsteRoute(Tegel tegel, ArrayList<Tegel> pad) {
        if (!(tegel.getMijnObject() instanceof Muur) && !(pad.contains(tegel)) && pad.size() < padLengte) {
            pad.add(tegel);
            if (tegel.getMijnObject() instanceof Vriend) {
                if (pad.size() < padLengte) {
                        kortstePad = (ArrayList<Tegel>) pad.clone();
                        padLengte = pad.size();
                }
            } else {
                kortsteRoute(tegel.getNorth(), pad);
                kortsteRoute(tegel.getEast(), pad);
                kortsteRoute(tegel.getSouth(), pad);
                kortsteRoute(tegel.getWest(), pad);
            }
            pad.remove(tegel);
        }
    }

    @Override
    public Image getImage() {
        return helperImage;
    }

    @Override
    public void pakObject(Speler speler) {
        kortsteRoute(this.getTile(), new ArrayList<Tegel>());
        for (final Tegel tegel : kortstePad) {
            tegel.setPad();
            timer.schedule(new TimerTask() {

                public void run() {
                    tegel.veegPad();
                }
            }, 10000);
        }
    }

    public ArrayList<Tegel> getKortstePad() {
        return kortstePad;
    }
}

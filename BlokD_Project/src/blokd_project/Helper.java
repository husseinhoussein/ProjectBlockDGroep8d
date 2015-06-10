package blokd_project;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Helper extends SpelObject {

    private Image helperImage;
    private String helperPath = "helper.png";
    ArrayList<Tegel> pad = new ArrayList<>();

    ArrayList<Tegel> kortstePad = new ArrayList<>();
    private int padLengte = Integer.MAX_VALUE;

    public Helper() {
        ImageIcon img = new ImageIcon(getImagePath(helperPath));
        helperImage = img.getImage();
    }

    protected void kortsteRoute(Tegel tegel, ArrayList<Tegel> pad) {
        if (!(tegel.getMijnObject() instanceof Muur) && !(pad.contains(tegel))) {
            pad.add(tegel);
            if (tegel.getMijnObject() instanceof Vriend) {
                if (pad.size() < padLengte) {
                    kortstePad = (ArrayList<Tegel>) pad.clone();
                    padLengte = pad.size();
                }
            } else {
                kortsteRoute(getTile().getNorth(), pad);
                kortsteRoute(getTile().getWest(), pad);
                kortsteRoute(getTile().getEast(), pad);
                kortsteRoute(getTile().getSouth(), pad);

            }
        }
        pad.remove(tegel);
    }

    @Override
    public Image getImage() {
        return helperImage;
    }

    @Override
    public void pakObject(Speler speler) {
        kortsteRoute(speler.getTile(), new ArrayList<Tegel>());
        for (Tegel tegel : pad) {
            tegel.setPad();
        }
    }
}

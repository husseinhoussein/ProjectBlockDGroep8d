package blokd_project;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Helper extends SpelObject {

    private Image helperImage;
    private String helperPath = "helper.png";
    ArrayList<Tegel> pad = new ArrayList<>();
   
    ArrayList<Tegel> kortstePad = new ArrayList<>();
    private int padLengte;
  

    public Helper() {
        ImageIcon img = new ImageIcon(getImagePath(helperPath));
        helperImage = img.getImage();
    }

    protected void kortsteRoute(Tegel tegel, ArrayList<Tegel> pad) {
        if (!(tegel.getMijnObject() instanceof Muur) && !(pad.contains(tegel))) {
            //... // voeg veld toe aan pad
            pad.add(tegel);
            if (tegel.getMijnObject() instanceof Vriend) {
                if (pad.size() < padLengte) {
                    kortstePad =  (ArrayList<Tegel>) pad.clone();
                    padLengte = pad.size();
                  
                }
            } else {
                for (Richting richting : Richting.values()) {
                    kortsteRoute(getTile().getNeighbours(tegel.getNorth(), tegel.getEast(), tegel.getSouth(), tegel.getWest()), pad);
                }
            }
            //... // verwijder veld uit pad
            pad.remove(tegel);
        }
    }

  
    @Override
    public Image getImage() {
        return helperImage;
    }
}

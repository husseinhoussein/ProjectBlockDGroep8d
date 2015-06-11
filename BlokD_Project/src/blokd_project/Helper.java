package blokd_project;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

public class Helper extends SpelObject {

    private Image helperImage;
    private String helperPath = "helper.png";
    ArrayList<Tegel> pad = new ArrayList<>();

    ArrayList<Tegel> kortstePad = new ArrayList<>();
    private int padLengte = Integer.MAX_VALUE;

    private Timer timer = new Timer();

    public Helper() {
        ImageIcon img = new ImageIcon(getImagePath(helperPath));
        helperImage = img.getImage();
    }

    protected void kortsteRoute(Tegel tegel, ArrayList<Tegel> pad) {
        if (!(tegel.getMijnObject() instanceof Muur) && !(pad.contains(tegel))) {
//            System.out.println("not sure if add");
            pad.add(tegel);
            if (tegel.getMijnObject() instanceof Vriend) {
//                System.out.println("not sure if instanceof");
                if (pad.size() < padLengte) {
//                    System.out.println("not sure if length comparison, excelsior!!!");
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
        kortsteRoute(speler.getTile(), new ArrayList<Tegel>());
        for (final Tegel tegel : kortstePad) {
            tegel.setPad();
            timer.schedule(new TimerTask(){
            
            public void run(){
            tegel.veegPad();
            }
            
            },10000);
         
            
        }
    }
}

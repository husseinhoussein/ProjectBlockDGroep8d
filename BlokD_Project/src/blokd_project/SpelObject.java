package blokd_project;

import java.awt.Image;
import java.io.File;

public abstract class SpelObject {

    private Tegel mijnTegel;

    public String getFilePath(String path) {
        return new File("").getAbsolutePath() + "/src/blokd_project/" + path;

    }

    public String getImagePath(String path) {
        return new File("").getAbsolutePath() + "/src/blokd_project/Images/" + path;

    }

    public abstract Image getImage();

    protected void setTile(Tegel t) {
        mijnTegel = t;
    }

    public Tegel getTile() {
        return mijnTegel;
    }
//    public Image getPlaatje() {
//        return plaatje;
//    }

//    private void tekenObject() {
//  //      this.muur.repaint();
//    }
    public void pakObject() {
        //code die oa de speler een ander spelobject laat meenemen/gebruiken/activeren ofzo
    }

}

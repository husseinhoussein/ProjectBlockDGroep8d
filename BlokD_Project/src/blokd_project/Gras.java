/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Hussein
 */
public class Gras extends SpelObject {
    private Image grassImage;
      public Gras() {
        ImageIcon img = new ImageIcon(getPath("Images/grass.png"));
        grassImage = img.getImage();
    }

    public Image getGrassImage() {
        return grassImage;
    }
    
}

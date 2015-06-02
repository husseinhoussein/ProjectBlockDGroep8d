/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author Hussein
 */
public class Map {

    private Scanner m;
    private String Map[] = new String[25];

    private Image grass, wall, friend;

    public Map() {
        ImageIcon img = new ImageIcon(getPath("Images/grass.png"));
        grass = img.getImage();
      

        openFile();
        readFile();
        closeFile();
    }

    public Image getGrass() {
        return grass;
    }

    
    public String getMap(int x, int y) {
        String index = Map[y].substring(x, x + 1);
        return index;
    }

    private String getPath(String path) {
        return new File("").getAbsolutePath() + "/src/blokd_project/" + path;

    }

    public void openFile() {
        try {

            m = new Scanner(new File(getPath("MazeData/maze_2.txt")));
        } catch (Exception e) {
            System.out.println("error loading map");
        }
    }

    public void readFile() {
        while (m.hasNext()) {
            for (int i = 0; i < 25; i++) {
                Map[i] = m.next();
            }
        }
    }

    public void closeFile() {
        m.close();
    }
}

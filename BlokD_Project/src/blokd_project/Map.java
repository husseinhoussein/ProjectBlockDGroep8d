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
    private String Map[] = new String[14];

    private Image grass, wall;

    public Map() {
        ImageIcon img = new ImageIcon("C:\\Users\\Hussein\\Documents\\GitHub\\ProjectBlockDGroep8d\\BlokD_Project\\src\\blokd_project\\Images\\grass.png");
        grass = img.getImage();
        img = new ImageIcon("C:\\Users\\Hussein\\Documents\\GitHub\\ProjectBlockDGroep8d\\BlokD_Project\\src\\blokd_project\\Images\\wall.png");
        wall = img.getImage();

        openFile();
        readFile();
        closeFile();
    }

    public Image getGrass() {
        return grass;
    }

    public Image getWall() {
        return wall;
    }

    public String getMap(int x, int y) {
        String index = Map[y].substring(x, x + 1);
        return index;
    }

    public void openFile() {
        try {
            m = new Scanner(new File("C:\\Users\\Hussein\\Documents\\GitHub\\ProjectBlockDGroep8d\\BlokD_Project\\src\\blokd_project\\MazeData\\maze.txt"));
        } catch (Exception e) {
            System.out.println("error loading map");
        }
    }

    public void readFile() {
        while (m.hasNext()) {
            for (int i = 0; i < 14; i++) {
                Map[i] = m.next();
            }
        }
    }

    public void closeFile() {
        m.close();
    }
}


package blokd_project;

import java.awt.Graphics;
import java.util.Arrays;
import java.util.Collections;

public class Level {

    private int width = 20;
    private int height = 15;
    private  int x;
    private int y;
    private final int[][] maze;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    public String getVeld() {
//        return veld;
//    }
//
//    public void setVeld(String veld) {
//        this.veld = veld;
//    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Level(int x, int y, int[][] maze) {
        this.x = x;
        this.y = y;
        this.maze = maze;
    }
}
    //private String[][] doolhof;

//    public Level(int x, int y) {
//       }
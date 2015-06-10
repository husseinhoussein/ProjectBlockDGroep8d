package blokd_project;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Map {

    private Scanner m;
    private String map[] = new String[25];
    int index = 0;
    
  String[] levels = {"maze.txt", "maze_1.txt", "maze_2.txt"};//new String[3];
  

  
    public void levelSwitch()
    {
        index ++;
    }

//    public String getMaze() {
//        return maze;
//    }
//
//    public void setMaze(String maze) {
//        this.maze = maze;
//    }

    public Map(JLabel label ) {

     
        openFile();
        readFile();
        closeFile();
    }

    public String getMap(int x, int y) {
        String index = map[y].substring(x, x + 1);
        return index;
    }

    private String getPath(String path) {
        return new File("").getAbsolutePath() + "/src/blokd_project/" + path;

    }

    public void openFile() {
        try {
             m = new Scanner(new File(getPath("MazeData/" + levels[index])));
             levelSwitch();
        } catch (Exception e) {
            System.out.println("error loading map");
        }
    }

    public void readFile() {
        while (m.hasNext()) {
            for (int i = 0; i < 25; i++) {
                map[i] = m.next();
            }
        }
    }

    public void closeFile() {
        m.close();
    }
}
//            switch(levels){
//                case MAZE1:
//                   m = new Scanner(new File(getPath("MazeData/" + Levels.MAZE1)));
//                    break;
//                case MAZE2:
//                   m = new Scanner(new File(getPath("MazeData/" + Levels.MAZE2)));
//                    break;
//                case MAZE3:
//                   m = new Scanner(new File(getPath("MazeData/" + Levels.MAZE3)));
//                    break;
                    
//            }
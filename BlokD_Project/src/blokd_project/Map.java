package blokd_project;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Map {

    private Scanner m;
    private String map[] = new String[25];

    public Map() {

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
            m = new Scanner(new File(getPath("MazeData/maze.txt")));
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

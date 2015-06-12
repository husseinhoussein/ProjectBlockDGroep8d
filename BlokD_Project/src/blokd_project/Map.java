package blokd_project;

import java.io.File;
import java.util.Scanner;
import javax.swing.JLabel;

public class Map {

    private Scanner m;
    private static int index = 0;
    private String map[] = new String[25];
    String[] levels = {"maze.txt", "maze_1.txt", "maze_2.txt"};

    public static void levelSwitch() {
        index++;
        if (index > 2) {
            index = 0;
        }
    }

    public Map(JLabel label) {
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
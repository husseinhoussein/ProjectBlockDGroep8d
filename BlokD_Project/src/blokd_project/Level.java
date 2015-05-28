package blokd_project;

import java.awt.Graphics;
import java.util.Arrays;
import java.util.Collections;

public class Level {

    private int width = 20;
    private int height = 15;
    private String veld = "X";
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

    public String getVeld() {
        return veld;
    }

    public void setVeld(String veld) {
        this.veld = veld;
    }

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

    //private String[][] doolhof;

    public Level(int x, int y) {
        this.x = x;
        this.y = y;
        maze = new int[this.x][this.y];
        generateMaze(0, 0);
    }

    public static void main(String[] args) {
        int x = args.length >= 1 ? (Integer.parseInt(args[0])) : 8;
        int y = args.length == 2 ? (Integer.parseInt(args[1])) : 8;
        Level maze = new Level(x, y);

        maze.generateMaze(x, y);
        maze.display(null);
    } 

    public void display(Graphics g) { 
        
        for (int i = 0; i < y; i++) {
            
            // draw the north edge
            for (int j = 0; j < x; j++) {
                System.out.print((maze[j][i] & 1) == 0 ? "+---" : "+   ");
//                g.drawString(maze[j][i] + 1 == 0 ? "+---" : "+    " , x, y);
            }
            System.out.println("+");
            // draw the west edge
            for (int j = 0; j < x; j++) {
                System.out.print((maze[j][i] & 8) == 0 ? "|   " : "    ");
//                g.drawString((maze[j][i] & 8) == 0 ? "|   " : "    ", x, y);
            }
            System.out.println("|");
//            g.drawString("|", x, y);
        }
        // draw the bottom line
        for (int j = 0; j < x; j++) {
            System.out.print("+---");
//            g.drawString("+---", x, y);
        }
        //it skips up to here, WHY; we don't know
        System.out.println("+");
//        g.drawString("+", x, y);
        
       //kan je de opbouw nalezen, en mijn misstap ontdekken ? proberen
    }

    public void generateMaze(int cx, int cy) {
        DIR[] dirs = DIR.values();
        Collections.shuffle(Arrays.asList(dirs));
        for (DIR dir : dirs) {
            int nx = cx + dir.dx;
            int ny = cy + dir.dy;
            if (between(nx, x) && between(ny, y)
                    && (maze[nx][ny] == 0)) {
                maze[cx][cy] |= dir.bit;
                maze[nx][ny] |= dir.opposite.bit;
                generateMaze(nx, ny);
            }
        }
    }

    private static boolean between(int v, int upper) {
        return (v >= 0) && (v < upper);
    }

    private enum DIR {

        N(1, 0, -1), S(2, 0, 1), E(4, 1, 0), W(8, -1, 0);
        private final int bit;
        private final int dx;
        private final int dy;
        private DIR opposite;

        // use the static initializer to resolve forward references
        static {
            N.opposite = S;
            S.opposite = N;
            E.opposite = W;
            W.opposite = E;
        }

        private DIR(int bit, int dx, int dy) {
            this.bit = bit;
            this.dx = dx;
            this.dy = dy;
        }
    };
}

//backup
//// matrix van 'doolhof', met start en eind positie
//    private void generateLevel() {
//        doolhof = new String[width][height];
//
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                doolhof[i][j] = "0";
//                if (i == 0) {
//                    doolhof[i][j] = "1";
//                }
//                if (j == 0) {
//                    doolhof[i][j] = "1";
//                }
//                if (i == width - 1) {
//                    doolhof[i][j] = "1";
//                }
//                if (j == height - 1) {
//                    doolhof[i][j] = "1";
//                }
//                doolhof[1][1] = "S";
//                doolhof[(width - 2)][(height - 2)] = "V";
//                System.out.print(doolhof[i][j] + "\t");
//
//            }
//            System.out.println();
//        }
//    }

package blokd_project;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Veld extends JPanel implements ActionListener {

    private int x = 0;
    private int y = 0;
    private int N = 25;

    Tegel[][] doolhof = new Tegel[N][N];

    private String message = "";
    private boolean win = false;
    private boolean kanKapot = false;
    private Font font = new Font("Serif", Font.BOLD, 48);
    public Timer timer;

    private Map m;
    private Speler p;

    //private Veld v;
    public Veld(JLabel label) {

        m = new Map();
        p = new Speler();

        addKeyListener(new KeyboardListener(p, label));
        setFocusable(true);
        timer = new Timer(25, this);
        timer.start();
        initTegel();
        temp();
    }

    private void initTegel() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                doolhof[i][j] = new Tegel(i, j);
                switch (m.getMap(i, j)) {
                    case "w":
                        doolhof[i][j].setSpelObject(new Muur());

                        break;
                    case "g":
                        doolhof[i][j].setSpelObject(new Gras());
                        break;
                    case "f":
                        doolhof[i][j].setSpelObject(new Vriend());
                        break;
                    case "h":
                        doolhof[i][j].setSpelObject(new Helper());
                        break;
                    case "p":
                        doolhof[i][j].setSpelObject(p);
                        
                        int pY = doolhof[i][j].getPositieY();
                        doolhof[i][j].setPositieY(pY +  1);
                        System.out.println();
                        repaint(pY +1);
                        
                        break; 
                    case "b":
                        doolhof[i][j].setSpelObject(new Bazooka());
                        break;
                    case "c":
                        doolhof[i][j].setSpelObject(new Valsspeler());
                        break;
                }
            }
        }
        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < N - 1; j++) {
                doolhof[i][j].setNeighbours(doolhof[i][j - 1], doolhof[i - 1][j], doolhof[i + 1][j], doolhof[i][j + 1]);
            }
        }
    }

    private void temp() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int pX = doolhof[i][j].getPositieX();
                int pY = doolhof[i][j].getPositieY();

                System.out.println(pX);
                System.out.println(pY);
//                pX = 1;
//                pY = 3;

            }

        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawItems((Graphics) g);
    }

    private void drawItems(Graphics gr) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                gr.drawImage(doolhof[i][j].getMijnObject().getImage(), i * 25, j * 25, 25, 25, null);

            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (m.getMap(p.getTileX(), p.getTileY()).equals("f")) {
//            message = "You win";
//            win = true;
        }
//        repaint();
//    }
}

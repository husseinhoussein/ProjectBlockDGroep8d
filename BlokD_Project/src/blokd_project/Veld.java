package blokd_project;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Veld extends JPanel implements ActionListener {

    private int N = 25;
    private Map m;
    private Speler p;
    private Helper h;
    private Valsspeler c;

    public Timer timer;
    Tegel[][] doolhof = new Tegel[N][N];
    

    public Veld(JLabel label, JLabel label2) {

        m = new Map(null);
        p = new Speler();
        c = new Valsspeler();
        h = new Helper();

        addKeyListener(new KeyboardListener(p, label, label2, c));
        setFocusable(true);
        timer = new Timer(25, this);
        timer.start();
        initTegel();
    }

    private void initTegel() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                doolhof[i][j] = new Tegel(i, j);
                switch (m.getMap(i, j)) {
                    case "x":
                        doolhof[i][j].setSpelObject(new Muur(false));
                        break;
                    case "w":
                        doolhof[i][j].setSpelObject(new Muur(true));
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
                        break;
                    case "b":
                        doolhof[i][j].setSpelObject(new Bazooka());
                        break;
                    case "c":
                        doolhof[i][j].setSpelObject(c);
                        break;
                }
            }
        }
        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < N - 1; j++) {
                doolhof[i][j].setNeighbours(doolhof[i][j - 1], doolhof[i + 1][j], doolhof[i][j + 1], doolhof[i - 1][j]);
            }
        }
    }

//    public void findObject() {
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//              
//                switch () {
//                    case doolhof[i][j].setNorth(doolhof[i][j - 1]):
//                    
//                }
//            }
//        }
//    }
    @Override
    public void paintComponent(Graphics g
    ) {
        super.paintComponent(g);

        drawItems((Graphics) g);
    }

    private void drawItems(Graphics gr) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (doolhof[i][j].getMijnObject() instanceof Gras && doolhof[i][j].getPad()) {
                    gr.drawImage(h.getImage(), i * 25, j * 25, 25, 25, null);
                } else {
                    gr.drawImage(doolhof[i][j].getMijnObject().getImage(), i * 25, j * 25, 25, 25, null);
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (m.getMap(p.getTileX(), p.getTileY()).equals("f")) {
//            message = "You win";
//            win = true;
//        }
        repaint();
    }
}

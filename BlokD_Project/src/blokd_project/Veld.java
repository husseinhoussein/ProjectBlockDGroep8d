package blokd_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Veld extends JPanel implements ActionListener {
    private int x = 0;
    private int y = 0;
//    private SpelObject item;

    private String message = "";
    private boolean win = false;
    private Font font = new Font("Serif", Font.BOLD, 48);
    public Timer timer;

    private Map m;
    private Speler p;
    private Vriend f;
    private Muur w;
    private Gras g;
    private Helper h;
    private Bazooka b;
    private Valsspeler c;
    private Veld v;

    public Veld(JLabel label) {

        m = new Map();
        p = new Speler();
        f = new Vriend();
        w = new Muur(p, m);
        g = new Gras();
        h = new Helper();
        b = new Bazooka();
        c = new Valsspeler();

        // s = new Doolhof();
        addKeyListener(new KeyboardListener(p, m, label, w));
        setFocusable(true);
        timer = new Timer(25, this);
        timer.start();
    }

    public Veld(Timer timer, Map m, Speler p, Vriend f, Muur w, Gras g, Helper h, Bazooka b, Valsspeler c, Veld v) {
        this.timer = timer;
        this.m = m;
        this.p = p;
        this.f = f;
        this.w = w;
        this.g = g;
        this.h = h;
        this.b = b;
        this.c = c;
        this.v = v;
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        if (m.getMap(p.getTileX(), p.getTileY()).equals("f")) {
            message = "You win";
            win = true;
        }
        repaint();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        if (!win) {
            for (int y = 0; y < 25; y++) {
                for (int x = 0; x < 25; x++) {

//                    if (m.getMap(x, y).equals("p")) {

                        graphics.drawImage(p.getPlayerImage(), p.getTileX() * 25, p.getTileY() * 25, null);
//
//                    }
                    if (m.getMap(x, y).equals("g")) {
                        graphics.drawImage(g.getGrassImage(), x * 25, y * 25, null);
                    }

                    if (m.getMap(x, y).equals("w")) {
                        graphics.drawImage(w.getWallImage(), x * 25, y * 25, null);
                    }

                    if (m.getMap(x, y).equals("f")) {
                        graphics.drawImage(f.getFriendImage(), x * 25, y * 25, null);
                    }

                    if (m.getMap(x, y).equals("h")) {
                        graphics.drawImage(h.getHelperImage(), x * 25, y * 25, null);
                    }

                    if (m.getMap(x, y).equals("b")) {
                        graphics.drawImage(b.getBazookaImage(), x * 25, y * 25, null);
                    }

                    if (m.getMap(x, y).equals("c")) {
                        graphics.drawImage(c.getCheaterImage(), x * 25, y * 25, null);
                    }

                }
            }
        }

        if (win) {

            graphics.setColor(Color.BLACK);
            graphics.setFont(font);

            graphics.drawString(message, 150, 250);
        }

    }

    private void verwijderObject(int posX, int posY) {
        //verwijder een object op meegegeven veld
    }

    private void plaatsObject(int posX, int posY) {
        //plaats een object op meegegeven veld
    }

    private Veld getNeighbour(int posX, int posY) {
        //geeft buurvelde terug van meegegeven veld
        return null;
    }

}

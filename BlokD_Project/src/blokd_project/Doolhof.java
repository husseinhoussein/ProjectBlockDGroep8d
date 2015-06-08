package blokd_project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class Doolhof {

    protected final int N = 25;
    private final int FRAME_WIDTH = 768;
    private final int FRAME_HEIGHT = 740;
    private int level = 1;

    public static void main(String[] args) {
        new Doolhof();
    }
    private JLabel ammoL;
    private JLabel currentLevelL;
    private JButton start;
    private JButton reset;
    private JLabel steps;
    private JPanel panelNorth;
    private JPanel panelSouth;
    private JPanel panelWest;
    private JPanel panelCornerNorth;
    private JPanel panelHints;
    private Speler p = new Speler();

    public Doolhof() {

        steps = new JLabel("Aantal stappen: 0");
        ammoL = new JLabel("Ammo:");
        Veld veld = new Veld(steps, ammoL);

        JFrame frame = new JFrame();
        frame.setTitle("Maze Game");
        frame.add(veld);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel hintsL = new JLabel("Hints: " + "Beweeg met de pijltjes toetsen");
        currentLevelL = new JLabel("Level: " + level);

        start = new JButton("Start");
        reset = new JButton("Reset");

        ActionListener listener = new ClickListener(veld);
        reset.addActionListener(listener);

        panelNorth = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelSouth = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelWest = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.PAGE_AXIS));
        panelCornerNorth = new JPanel();
        panelHints = new JPanel();

        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelWest, BorderLayout.WEST);
        frame.add(panelSouth, BorderLayout.SOUTH);

        panelNorth.add(panelCornerNorth, BorderLayout.WEST);
        panelNorth.add(panelHints, BorderLayout.EAST);
        panelCornerNorth.add(steps);
        panelHints.add(hintsL);

        panelSouth.add(start);
        panelSouth.add(reset);

        panelWest.add(currentLevelL, BorderLayout.WEST);
        panelWest.add(ammoL, BorderLayout.WEST);

        panelCornerNorth.setBorder(new EtchedBorder());
        panelHints.setBorder(new EtchedBorder());

        panelCornerNorth.setSize(new Dimension(60, 100));
        panelCornerNorth.setSize(new Dimension(FRAME_WIDTH - 120, 100));
        panelSouth.setPreferredSize(new Dimension(FRAME_WIDTH, 40));
        panelWest.setPreferredSize(new Dimension(125, FRAME_HEIGHT));
        panelHints.setPreferredSize(new Dimension(FRAME_WIDTH - 160, 40));

    }

    private void mazeStart() {
        //enable speler om spelfuncties te gebruiken (te bewegen etc)
    }

    private void mazeReset() {
        //regenerate level
    }
}

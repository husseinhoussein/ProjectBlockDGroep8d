package blokd_project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

public class Doolhof {

    protected final int N = 25;
    private final int FRAME_WIDTH = 768;
    private final int FRAME_HEIGHT = 740;
    private JLabel ammoL;
    private JLabel currentLevelL;
    private JLabel hintsL;
    private JButton start;
    private JButton reset;
    private JLabel steps;
    private JPanel panelNorth;
    private JPanel panelSouth;
    private JPanel panelWest;
    private JPanel panelCornerNorth;
    private JPanel panelHints;
    private Speler p = new Speler();
    private JFrame frame;
    private Veld veld;

    public static void main(String[] args) {
        new Doolhof();

    }

    public void refreshFrame() {
        SwingUtilities.updateComponentTreeUI(frame);
        frame.invalidate();
        frame.validate();
        frame.revalidate();
        frame.repaint();
//          frame.add(veld).repaint();
    }

    private void createDoolhof() {
        steps = new JLabel("Aantal stappen: 0");
        ammoL = new JLabel("Ammo: 0");
        Veld veld = new Veld(steps, ammoL);
//
        frame = new JFrame();
        frame.setTitle("Maze Game");
        frame.add(veld).repaint();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hintsL = new JLabel("Hints: " + "Beweeg met de pijltjes toetsen");
        currentLevelL = new JLabel("Level: ");
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
//
        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelWest, BorderLayout.WEST);
        frame.add(panelSouth, BorderLayout.SOUTH);
//
        panelNorth.add(panelCornerNorth, BorderLayout.WEST);
        panelNorth.add(panelHints, BorderLayout.EAST);
        panelCornerNorth.add(steps);
        panelHints.add(hintsL);
//
        panelSouth.add(start);
        panelSouth.add(reset);
//
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

    public Doolhof() {
        createDoolhof();
//        steps = new JLabel("Aantal stappen: 0");
//        ammoL = new JLabel("Ammo: 0");
//        Veld veld = new Veld(steps, ammoL);
////
//        frame = new JFrame();
//        frame.setTitle("Maze Game");
//        frame.add(veld).repaint();
//        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        hintsL = new JLabel("Hints: " + "Beweeg met de pijltjes toetsen");
//        currentLevelL = new JLabel("Level: ");
//        start = new JButton("Start");
//        reset = new JButton("Reset");
//        ActionListener listener = new ClickListener(veld);
//        reset.addActionListener(listener);
//        panelNorth = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        panelSouth = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        panelWest = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.PAGE_AXIS));
//        panelCornerNorth = new JPanel();
//        panelHints = new JPanel();
////
//        frame.add(panelNorth, BorderLayout.NORTH);
//        frame.add(panelWest, BorderLayout.WEST);
//        frame.add(panelSouth, BorderLayout.SOUTH);
////
//        panelNorth.add(panelCornerNorth, BorderLayout.WEST);
//        panelNorth.add(panelHints, BorderLayout.EAST);
//        panelCornerNorth.add(steps);
//        panelHints.add(hintsL);
////
//        panelSouth.add(start);
//        panelSouth.add(reset);
////
//        panelWest.add(currentLevelL, BorderLayout.WEST);
//        panelWest.add(ammoL, BorderLayout.WEST);
//
//        panelCornerNorth.setBorder(new EtchedBorder());
//        panelHints.setBorder(new EtchedBorder());
//
//        panelCornerNorth.setSize(new Dimension(60, 100));
//        panelCornerNorth.setSize(new Dimension(FRAME_WIDTH - 120, 100));
//        panelSouth.setPreferredSize(new Dimension(FRAME_WIDTH, 40));
//        panelWest.setPreferredSize(new Dimension(125, FRAME_HEIGHT));
//        panelHints.setPreferredSize(new Dimension(FRAME_WIDTH - 160, 40));
    }

    protected void mazeStart() {
        new Doolhof();
    }

    private void mazeReset() {
        //regenerate level
    }

}

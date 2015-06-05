package blokd_project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class Doolhof {

    protected final int N = 25;
    private final int FRAME_WIDTH = 768;
    private final int FRAME_HEIGHT = 740;
    private int ammo = 999;
    private int level = 1;
    

    public static void main(String[] args) {
        new Doolhof();
        
    }

    public Doolhof() {
        
        JLabel steps = new JLabel("Aantal stappen: 0" );
        Veld veld = new Veld(steps);
        
        JFrame frame = new JFrame();
        frame.setTitle("Maze Game");
        frame.add(veld);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JLabel hintsL = new JLabel("Hints: " + "Beweeg met de pijltjes toetsen");
        JLabel ammoL = new JLabel("Ammo: " + ammo);
        JLabel currentLevelL = new JLabel("Level: " + level);

        JButton start = new JButton("Start");
        JButton reset = new JButton("Reset");
        

        ActionListener listener = new ClickListener(veld);
        reset.addActionListener(listener);

        JPanel panelNorth = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panelSouth = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panelWest = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.PAGE_AXIS));
        JPanel panelCornerNorth = new JPanel();
        JPanel panelHints = new JPanel();

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

        panelCornerNorth.setSize(new Dimension(50, 100));
        panelCornerNorth.setSize(new Dimension(FRAME_WIDTH - 120, 100));
        panelSouth.setPreferredSize(new Dimension(FRAME_WIDTH, 40));
        panelWest.setPreferredSize(new Dimension(125, FRAME_HEIGHT));
        panelHints.setPreferredSize(new Dimension(FRAME_WIDTH - 145, 40));
      //  frame.repaint();

    }

    private void mazeStart() {
        //enable speler om spelfuncties te gebruiken (te bewegen etc)
    }

    private void mazeReset() {
        //regenerate level
    }

}

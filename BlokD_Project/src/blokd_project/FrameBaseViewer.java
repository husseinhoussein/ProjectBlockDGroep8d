package blokd_project;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class FrameBaseViewer {

    public static void main(String[] args) {

        int[][] maze = null;

        JFrame doolhofFrame = new JFrame();

        JPanel panelNorth = new JPanel();
        JPanel panelSouth = new JPanel();

        JLabel steps = new JLabel("Aantal stappen:");

        JButton startB = new JButton("start");
        JButton resetB = new JButton("reset");

        panelNorth.add(steps);
        panelSouth.add(startB);
        panelSouth.add(resetB);

        doolhofFrame.add(panelNorth, BorderLayout.NORTH);
        doolhofFrame.add(panelSouth, BorderLayout.SOUTH);
        doolhofFrame.setTitle("Doolhof Game");
        doolhofFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        doolhofFrame.setSize(500, 400);

//        int a = args.length >= 1 ? (Integer.parseInt(args[0])) : 8;
//        int b = args.length == 2 ? (Integer.parseInt(args[1])) : 8;
//
//        int a = 0; 
//        int b = 0; 
//        Level lvl = new Level(a, b, maze);   <------ het lag hier aan, die maze parameter verklote alles.
//        alleen lukt het nu niet met de getX, hij maakt de hele tijd dezelfde maze aan, 
//        ik dacht misschien aan een loop die het groter en "moeilijker"maakt.
//        P.S. de a, b en dan a = x, b = y omzeiling eindigd weer in alleen de plusjes... so i am at a loss.
        Level lvl;
        int x = 12;//lvl.getX();
        int y = 10;//lvl.getY();
//        a = x;
//        b = y;
        lvl =  new Level(x, y);
        lvl.generateMaze(x, y);

        ActionListener listener = new ClickListener(lvl);
        startB.addActionListener(listener);
        doolhofFrame.setVisible(true);
    }
}
//Kannibalisatie:
//JPanel panel = new JPanel();
//       panel.setLayout(new BorderLayout());
//        
//       JPanel northPanel = new JPanel();
//       northPanel.setBorder(new EtchedBorder());
//        northPanel.add(label);
//        northPanel.add(textfield);
//        northPanel.add(button);
//        panel.add(northPanel, BorderLayout.NORTH);
//        JPanel westPanel = new JPanel();
//        westPanel.setBorder(new EtchedBorder());
//        panel.add(westPanel, BorderLayout.WEST);
//        JPanel centerPanel = new JPanel();
//        centerPanel.setBorder(new EtchedBorder());
//        JComponent component = new ChartComponent();
//        centerPanel.add(component);
//        panel.add(centerPanel, BorderLayout.CENTER);
//        component.paintComponents(null);
//        JPanel southPanel = new JPanel();
//        southPanel.setBorder(new EtchedBorder());
//        JButton startButton = new JButton();
//        southPanel.add(startButton);
//        frame vullen met de panels.
//        frame.add(southPanel, BorderLayout.SOUTH);
//        ActionListener listener = new ClickListener();
//        button.addActionListener(listener);

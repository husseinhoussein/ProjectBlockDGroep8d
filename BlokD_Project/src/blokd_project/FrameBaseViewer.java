
package blokd_project;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class FrameBaseViewer 
{
    public static void main(String[] args) 
    {
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
        doolhofFrame.setTitle ("Doolhof Game");
        doolhofFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        doolhofFrame.setSize(500,400);
        
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

package blokd_project;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

public class FrameBase extends JFrame
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 400;
    
    public FrameBase()
    {
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        createComponents();
    }

    public static void main(String[] args) 
    {
    }
    
    private static void createComponents()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JPanel northPanel = new JPanel();
        northPanel.setBorder(new EtchedBorder());
//        northPanel.add(label);
//        northPanel.add(textfield);
//        northPanel.add(button);
        panel.add(northPanel, BorderLayout.NORTH);
        
        JPanel westPanel = new JPanel();
        westPanel.setBorder(new EtchedBorder());
        panel.add(westPanel, BorderLayout.WEST);
        
        JPanel centerPanel = new JPanel();
        centerPanel.setBorder(new EtchedBorder());
//        JComponent component = new ChartComponent();
//        centerPanel.add(component);
        panel.add(centerPanel, BorderLayout.CENTER);
        //component.paintComponents(null);
        
        JPanel southPanel = new JPanel();
        southPanel.setBorder(new EtchedBorder());
        JButton startButton = new JButton();
        southPanel.add(startButton);
        panel.add(southPanel, BorderLayout.SOUTH);

        ActionListener listener = new ClickListener();
        //button.addActionListener(listener);
    }

}

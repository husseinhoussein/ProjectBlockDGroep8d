
package blokd_project;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class FrameBaseViewer 
{
    public static void main(String[] args) 
    {
        JFrame doolhofFrame = new FrameBase();

        doolhofFrame.setTitle ("Doolhof Game");
        doolhofFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComponent component = new ChartComponent();
        doolhofFrame.add(component);  
        
        doolhofFrame.setVisible(true);
               
    }

}

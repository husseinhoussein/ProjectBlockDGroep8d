/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class ClickListener implements ActionListener
{ private JComponent comp;
    
    
    public ClickListener(JComponent comp) {
        this.comp = comp;
    }

   @Override
    public void actionPerformed(ActionEvent event)
    {
        this.comp.repaint();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class ClickListener implements ActionListener
{ //non functioneel, moet nog correct geimplenteerd worden.
    private JComponent comp;
    private Level lvl;

    public ClickListener(JComponent comp, Level lvl) {
        this.comp = comp;
        this.lvl = lvl;
    }

    ClickListener(Level lvl) {
        this.lvl = lvl;
    }

   

   @Override
    public void actionPerformed(ActionEvent event)
    {
        this.comp.repaint();
        
    }
}

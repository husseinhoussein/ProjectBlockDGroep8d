/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class ClickListener implements ActionListener { //non functioneel, moet nog correct geimplenteerd worden.
    // private JComponent comp;
    // private Doolhof doolhof;

    private Veld veld;

    public ClickListener(Veld veld) {
        this.veld = veld;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        //this.comp.repaint(veld);
        this.veld.repaint();
//        System.out.println("I was clicked.");

       // this.lvl.display(null);
    }
}

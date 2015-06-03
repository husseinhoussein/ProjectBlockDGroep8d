
package blokd_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class ClickListener implements ActionListener { 

    private Veld veld;

    public ClickListener(Veld veld) {
        this.veld = veld;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        this.veld.repaint();
    }
}

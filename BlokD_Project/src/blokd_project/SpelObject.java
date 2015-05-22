
package blokd_project;

import javax.swing.JComponent;

public class SpelObject 
{
    private String plaatje = "P"; //dit moet nog een ander type worden
    private JComponent muur;
    String speler = "S";
    String vriend = "V";
    
    private void tekenObject() 
    {
        this.muur.repaint();
    }
    
    private void pakObject()
    {
        //code die oa de speler een ander spelobject laat meenemen/gebruiken/activeren ofzo
    }
    
}


package blokd_project;

import java.io.File;
import javax.swing.JComponent;

public class SpelObject 
{
    private JComponent muur;
    
      public String getPath(String path) {
        return new File("").getAbsolutePath() + "/src/blokd_project/" + path;

    }
    
    private void tekenObject() 
    {
        this.muur.repaint();
    }
    
    private void pakObject()
    {
        //code die oa de speler een ander spelobject laat meenemen/gebruiken/activeren ofzo
    }
    
}

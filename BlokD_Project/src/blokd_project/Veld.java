
package blokd_project;

public class Veld 
{
    private int postitieX;
    private int positieY;
    private SpelObject plaatje;

    private Veld(int postitieX, int positieY, SpelObject plaatje) {
        this.postitieX = postitieX;
        this.positieY = positieY;
        this.plaatje = plaatje;
    }

    
    private void verwijderObject(int posX, int posY)
    {
        //verwijder een object op meegegeven veld
    }
    
    private void plaatsObject(int posX, int posY)
    {
        //plaats een object op meegegeven veld
    }
    
    private Veld getNeighbour(int posX, int posY)
    {
        //geeft buurvelde terug van meegegeven veld
       return null;
    }
}

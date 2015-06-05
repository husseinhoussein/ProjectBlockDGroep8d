
package blokd_project;

public class Tegel {

    private int positieY = 0;
    private int positieX = 0;
    private SpelObject mijnObject = null;

    private Tegel north;
    private Tegel east;
    private Tegel south;
    private Tegel west;

    public int getPositieX() {
        return positieX;
    }

    public int getPositieY() {
        return positieY;
    }

    public Tegel getNorth() {
        return north;
    }

    public Tegel getEast() {
        return east;
    }

    public Tegel getSouth() {
        return south;
    }

    public Tegel getWest() {
        return west;
    }

    public Tegel(int x, int y) {
        this.positieX = x;
        this.positieY = y;
    }

    protected void setNeighbours(Tegel n, Tegel e, Tegel s, Tegel w) {
        north = n;
        east = e;
        south = s;
        west = w;

    }

    public SpelObject getMijnObject() {
        return mijnObject;
    }

    protected void setSpelObject(SpelObject s) {
        mijnObject = s;
        s.setTile(this);
    }

    private void verwijderObject(int posX, int posY) {
        //verwijder een object op meegegeven veld
    }
}

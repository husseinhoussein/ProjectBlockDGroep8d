
package blokd_project;

import java.util.HashSet;

public class Tegel {

    private int positieY = 0;
    private int positieX = 0;
    private SpelObject mijnObject = null;

    private Tegel north;

    public Tegel(Tegel north, Tegel east, Tegel south, Tegel west) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public void setPositieY(int positieY) {
        this.positieY = positieY;
    }

    public void setPositieX(int positieX) {
        this.positieX = positieX;
    }
    private Tegel east;
    private Tegel south;

    public void setNorth(Tegel north) {
        this.north = north;
    }

    public void setEast(Tegel east) {
        this.east = east;
    }

    public void setSouth(Tegel south) {
        this.south = south;
    }

    public void setWest(Tegel west) {
        this.west = west;
    }
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
    protected Tegel getNeighbours(Tegel n, Tegel e, Tegel s, Tegel w) {
     
        e = getEast();
        w = getWest();
        n = getNorth();
        s = getSouth();
        
        return new Tegel(n, e, s, w);

    }
    
      public SpelObject getMijnObject() {
        return mijnObject;
    }

    protected void setSpelObject(SpelObject s) {
        mijnObject = s;
        s.setTile(this);
    }

    protected void verwijderObject(Tegel weg) {
        weg.setSpelObject(mijnObject);
        setSpelObject(new Gras());   
    }
    
    public void verplaatsObject(Tegel naar){
        naar.setSpelObject(mijnObject);
        setSpelObject(new Gras());        
    }
}

package blokd_project;

import java.awt.event.KeyEvent;

public class Tegel {

    private int positieY = 0;
    private int positieX = 0;
    private boolean staatOpPad = false;
    private SpelObject mijnObject = null;
    private Tegel north;
    private Tegel east;
    private Tegel south;
    private Tegel west;

    public Tegel(Tegel north, Tegel east, Tegel south, Tegel west) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public void setPad() {
        staatOpPad = true;
    }

    public void veegPad() {
        staatOpPad = false;
    }

    public boolean getPad() {
        return staatOpPad;
    }

    public void setPositieY(int positieY) {
        this.positieY = positieY;
    }

    public void setPositieX(int positieX) {
        this.positieX = positieX;
    }

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

    public void setMijnObject(SpelObject mijnObject) {
        this.mijnObject = mijnObject;
        mijnObject.setTile(this);
    }

    public SpelObject getMijnObject() {
        return mijnObject;
    }

    protected void getBuur(int dir) {
        Tegel naar = null;
        SpelObject stuk = null;

        switch (dir) {
            case KeyEvent.VK_UP:
                naar = mijnObject.getTile().getNorth();
                break;
            case KeyEvent.VK_RIGHT:
                naar = mijnObject.getTile().getEast();
                break;
            case KeyEvent.VK_DOWN:
                naar = mijnObject.getTile().getSouth();
                break;
            case KeyEvent.VK_LEFT:
                naar = mijnObject.getTile().getWest();
                break;
            default:
        }
    }

    protected void setSpelObject(SpelObject s) {
        mijnObject = s;
        s.setTile(this);
    }

    protected void verwijderObject() {
        setSpelObject(new Gras());
    }

    public void verplaatsObject(Tegel naar) {
        naar.setSpelObject(mijnObject);
        setSpelObject(new Gras());
    }
}
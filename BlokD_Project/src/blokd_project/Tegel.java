/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokd_project;

/**
 *
 * @author Hussein
 */
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

//        north.positieX = 0;
//        north.positieY = -1;
//        east.positieX = +1;
//        east.positieY = 0;
//        south.positieX = 0;
//        south.positieY = +1;
//        west.positieX = -1;
//        west.positieY = 0;
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

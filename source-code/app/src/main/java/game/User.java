package game;

import java.util.Vector;

import javafx.scene.paint.Color;



public class User {
    private Vector<Integer> pick;
    private String symbol;
    private String title;

    User() {
        this.pick=new Vector<Integer>();
        this.symbol="-";
        this.title="";
    }

    User(String title) {
        this.pick=new Vector<Integer>();
        
        this.title=title;
    }

    public void setPick(int value) {
        pick.add(value);
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Vector<Integer> getPick() {
        return pick;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getTitle() {
        return title;
    }

    public boolean haveWon() {
        /*

        1 | 2 | 3
        4 | 5 | 6
        7 | 8 | 9

        */
        
        return false;
    }
}

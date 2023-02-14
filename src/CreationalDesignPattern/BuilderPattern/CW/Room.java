package CreationalDesignPattern.BuilderPattern.CW;

import CreationalDesignPattern.Jan02.Door;
import CreationalDesignPattern.Jan02.Wall;

public class Room {
    private int n;
    Wall wall;
    Door door;
    String side;
    public Room(int n){
        this.n = n;
    }

    public void setSide(String side, Wall wall){
        this.side = side;
        this.wall = wall;
    }

    public void setSide(String side,Door door){
        this.side = side;
        this.door = door;
    }
}

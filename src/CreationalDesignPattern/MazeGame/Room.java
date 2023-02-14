package CreationalDesignPattern.MazeGame;

import java.util.ArrayList;
import java.util.List;

public class Room extends MapSite {
    private List<MapSite> sides = new ArrayList<>(4);
    private int roomNumber;

    public Room(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public MapSite getSide(){
        return this;
    }

    public void setSide(String direction, MapSite mapSite){
        //set sides
    }

    public void enter(){
        // implement
    }
}
package DesignPattern.MazeGame;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    // private attributes
    List<Room> rooms = new ArrayList<>();
    public Maze(){

    }

    public void addRoom(Room r){
        rooms.add(r);
    }

    public Room roomNo(int n){
        return rooms.get(n);
    }
}

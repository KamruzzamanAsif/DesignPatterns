package CreationalDesignPattern.BuilderPattern.CW;

import java.util.List;

public class Maze {
    List<Room> rooms;
    public void AddRoom(Room r){
        rooms.add(r);
    }
}

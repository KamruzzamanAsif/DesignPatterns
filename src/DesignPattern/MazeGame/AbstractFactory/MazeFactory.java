package DesignPattern.MazeGame.AbstractFactory;

import DesignPattern.MazeGame.Door;
import DesignPattern.MazeGame.Maze;
import DesignPattern.MazeGame.Room;
import DesignPattern.MazeGame.Wall;

import java.util.Map;

public class MazeFactory {
    public MazeFactory(){

    }

    // factory methods
    public Maze makeMaze(){
        return new Maze();
    }
    public Room makeRoom(int n){
        return new Room(n);
    }
    public Wall makeWall(){
        return new Wall();
    }
    public Door makDoor(Room r1, Room r2){
        return new Door(r1, r2);
    }
}

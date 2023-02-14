package CreationalDesignPattern.MazeGame.AbstractFactory;

import CreationalDesignPattern.MazeGame.Door;
import CreationalDesignPattern.MazeGame.Maze;
import CreationalDesignPattern.MazeGame.Room;
import CreationalDesignPattern.MazeGame.Wall;

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

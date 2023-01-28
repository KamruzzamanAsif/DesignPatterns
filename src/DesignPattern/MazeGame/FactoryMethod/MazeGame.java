package DesignPattern.MazeGame.FactoryMethod;

import DesignPattern.MazeGame.Door;
import DesignPattern.MazeGame.Maze;
import DesignPattern.MazeGame.Room;
import DesignPattern.MazeGame.Wall;

public class MazeGame {
    // the operation_method() just like the book
    public Maze createMaze(){
        Maze amaze = makeMaze();

        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door theDoor = new Door(r1, r2);

        amaze.addRoom(r1);
        amaze.addRoom(r2);

        r1.setSide("North", makeWall());
        r1.setSide("East", theDoor);
        r1.setSide("South", makeWall());
        r1.setSide("West", makeWall());

        r2.setSide("North", makeWall());
        r2.setSide("East", makeWall());
        r2.setSide("South", makeWall());
        r2.setSide("West", theDoor);

        return amaze;
    }



    // factory method with default implementations
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

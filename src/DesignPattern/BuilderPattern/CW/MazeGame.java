package DesignPattern.BuilderPattern.CW;

import DesignPattern.Jan02.Door;
import DesignPattern.Jan02.Maze;
import DesignPattern.Jan02.Room;
import DesignPattern.Jan02.Wall;

public class MazeGame {

    // factory methods
    public DesignPattern.Jan02.Maze makeMaze(){
        return new Maze();
    }
    public DesignPattern.Jan02.Room makeRoom(int n){
        return new DesignPattern.Jan02.Room(n);
    }
    public Wall makeWall(){
        return new Wall();
    }
    public Door makeDoor(DesignPattern.Jan02.Room r1, Room r2){
        return new Door(r1, r2);
    }

    public DesignPattern.BuilderPattern.CW.Maze createMaze(MazeBuilder builder){
        builder.BuildMaze();
        builder.BuildRoom(1);
        builder.BuildRoom(2);
        builder.BuildDoor(1, 2);
        return builder.getMaze();
    }

    public DesignPattern.BuilderPattern.CW.Maze createComplexMaze(MazeBuilder builder){
        builder.BuildRoom(1);
        builder.BuildRoom(100);

        return builder.getMaze();
    }
}

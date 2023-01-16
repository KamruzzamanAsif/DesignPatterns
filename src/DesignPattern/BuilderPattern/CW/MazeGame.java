package DesignPattern.BuilderPattern.CW;

import DesignPattern.Jan02.Door;
import DesignPattern.Jan02.Maze;
import DesignPattern.Jan02.Room;
import DesignPattern.Jan02.Wall;

public class MazeGame {
    public DesignPattern.Jan02.Maze createMaze(){
        DesignPattern.Jan02.Maze amaze = makeMaze();

        DesignPattern.Jan02.Room r1 = new DesignPattern.Jan02.Room(1);
        DesignPattern.Jan02.Room r2 = new DesignPattern.Jan02.Room(2);
        Door theDoor = new Door(r1, r2);

        amaze.AddRoom(r1);
        amaze.AddRoom(r2);

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

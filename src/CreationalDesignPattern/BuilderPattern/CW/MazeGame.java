package CreationalDesignPattern.BuilderPattern.CW;

import CreationalDesignPattern.Jan02.Door;
import CreationalDesignPattern.Jan02.Maze;
import CreationalDesignPattern.Jan02.Room;
import CreationalDesignPattern.Jan02.Wall;

public class MazeGame {

    // factory methods
    public CreationalDesignPattern.Jan02.Maze makeMaze(){
        return new Maze();
    }
    public CreationalDesignPattern.Jan02.Room makeRoom(int n){
        return new CreationalDesignPattern.Jan02.Room(n);
    }
    public Wall makeWall(){
        return new Wall();
    }
    public Door makeDoor(CreationalDesignPattern.Jan02.Room r1, Room r2){
        return new Door(r1, r2);
    }

    public CreationalDesignPattern.BuilderPattern.CW.Maze createMaze(MazeBuilder builder){
        builder.BuildMaze();
        builder.BuildRoom(1);
        builder.BuildRoom(2);
        builder.BuildDoor(1, 2);
        return builder.getMaze();
    }

    public CreationalDesignPattern.BuilderPattern.CW.Maze createComplexMaze(MazeBuilder builder){
        builder.BuildRoom(1);
        builder.BuildRoom(100);

        return builder.getMaze();
    }
}

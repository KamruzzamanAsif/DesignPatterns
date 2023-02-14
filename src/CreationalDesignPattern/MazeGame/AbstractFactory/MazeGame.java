package CreationalDesignPattern.MazeGame.AbstractFactory;

import CreationalDesignPattern.MazeGame.Door;
import CreationalDesignPattern.MazeGame.Maze;
import CreationalDesignPattern.MazeGame.Room;

public class MazeGame {
    public Maze createMaze(MazeFactory mazeFactory){
        Maze amaze = mazeFactory.makeMaze();

        Room r1 = mazeFactory.makeRoom(1);
        Room r2 = mazeFactory.makeRoom(2);
        Door theDoor = mazeFactory.makDoor(r1, r2);

        amaze.addRoom(r1);
        amaze.addRoom(r2);

        r1.setSide("North", mazeFactory.makeWall());
        r1.setSide("East", theDoor);
        r1.setSide("South", mazeFactory.makeWall());
        r1.setSide("West", mazeFactory.makeWall());

        r2.setSide("North", mazeFactory.makeWall());
        r2.setSide("East", mazeFactory.makeWall());
        r2.setSide("South", mazeFactory.makeWall());
        r2.setSide("West", theDoor);

        return amaze;
    }
}

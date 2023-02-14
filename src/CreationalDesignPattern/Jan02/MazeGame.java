package CreationalDesignPattern.Jan02;

public class MazeGame {
    public Maze createMaze(){
        Maze amaze = makeMaze();

        Room r1 = new Room(1);
        Room r2 = new Room(2);
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
    public Maze makeMaze(){
        return new Maze();
    }
    public Room makeRoom(int n){
        return new Room(n);
    }
    public Wall makeWall(){
        return new Wall();
    }
    public Door makeDoor(Room r1, Room r2){
        return new Door(r1, r2);
    }
}

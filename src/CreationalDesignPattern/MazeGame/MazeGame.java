package CreationalDesignPattern.MazeGame;

public class MazeGame {
    public Maze createMaze(){
        Maze amaze = new Maze();

        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door theDoor = new Door(r1, r2);

        amaze.addRoom(r1);
        amaze.addRoom(r2);

        r1.setSide("North", new Wall());
        r1.setSide("East", theDoor);
        r1.setSide("South", new Wall());
        r1.setSide("West", new Wall());

        r2.setSide("North", new Wall());
        r2.setSide("East", new Wall());
        r2.setSide("South", new Wall());
        r2.setSide("West", theDoor);

        return amaze;
    }
}

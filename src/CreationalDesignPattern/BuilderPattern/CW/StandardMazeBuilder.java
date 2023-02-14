package CreationalDesignPattern.BuilderPattern.CW;

import CreationalDesignPattern.Jan02.Wall;

public class StandardMazeBuilder extends MazeBuilder{

    private Maze currentMaze;
//    private Direction commonWall(Room r1, Room r2);

    public StandardMazeBuilder(){
       // this.currentMaze = 0;
    }

    public void BuildMaze(){
        currentMaze = new Maze();
    }

    public void BuildRoom(int n) {
        if (currentMaze.rooms.get(n) != null) {
            Room room = new Room(n);
            currentMaze.AddRoom(room);
            room.setSide("North", new Wall());
            room.setSide("South", new Wall());
            room.setSide("East", new Wall());
            room.setSide("West", new Wall());
        }
    }


    @Override
    public Maze getMaze() {
        return currentMaze;
    }
}

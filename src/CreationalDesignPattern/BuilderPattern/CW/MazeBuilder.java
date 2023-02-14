package CreationalDesignPattern.BuilderPattern.CW;

public abstract class MazeBuilder {

    protected MazeBuilder(){

    }
    public void BuildMaze() {}
    public void BuildRoom(int room) { }
    public void BuildDoor(int roomFrom, int roomTo) { }
    public abstract Maze getMaze();
}

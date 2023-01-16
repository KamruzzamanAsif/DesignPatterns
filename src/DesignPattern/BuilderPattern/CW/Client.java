package DesignPattern.BuilderPattern.CW;

public class Client {

    public static void main(String[] args) {
        Maze maze;
        MazeGame game = new MazeGame();
        StandardMazeBuilder builder = new StandardMazeBuilder();
        game.createMaze(builder);
        maze = builder.getMaze();
    }
}

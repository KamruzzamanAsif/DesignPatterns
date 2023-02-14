package CreationalDesignPattern.MazeGame.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        MazeFactory bombedMazeFactory = new BombedMazeFactory();
        mazeGame.createMaze(bombedMazeFactory);

        //
        MazeGame mazeGame1 = new MazeGame();
        MazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        mazeGame1.createMaze(enchantedMazeFactory);
    }
}

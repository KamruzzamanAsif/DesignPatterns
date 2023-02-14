package CreationalDesignPattern.MazeGame.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        MazeGame enchantedMazeGame = new EnchantedMazeGame();
        enchantedMazeGame.createMaze();
        // play

        MazeGame bombedMazeGame = new BombedMazeGame();
        bombedMazeGame.createMaze();
        // play
    }
}
